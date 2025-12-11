import java.util.LinkedHashMap;
import java.util.Map;

public class MiVisitor extends PLATABaseVisitor<Valor> {

    public static final double VALOR_PEQUEÑO = 0.00000000001;
    private Map<String, Valor> variables = new LinkedHashMap<>();

    /**
     * Procesa una sentencia de asignación de la forma:
     * <pre>
     *     id = expr;
     * </pre>
     * Evalúa la expresión a la derecha del '=' y la almacena en la tabla
     * de variables usando el nombre del identificador.
     *
     * @param ctx contexto del parser correspondiente a {@code asignacion}.
     * @return siempre {@link Valor#VACIO}, ya que una asignación no produce un valor evaluable.
     */
    @Override
    public Valor visitAsignacion(PLATAParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        Valor valor = (Valor) visit(ctx.expr());

        variables.put(nombre, valor);
        System.out.println("El Value de la variable " + nombre + " es " + valor);

        return Valor.VACIO;
    }


    @Override
    public Valor visitAvanza(PLATAParser.AvanzaContext ctx) {
        String avanza = ctx.AVANZA().getText();
        Valor valor1 = (Valor) visit(ctx.expr(0));
        Valor valor2 = (Valor) visit(ctx.expr(1));
        System.out.println("El roboto " + avanza + " " + valor1.asDouble() +
                " metros a una velicidad de " + valor2.asDouble() + " m/s");
        return Valor.VACIO;
    }

    @Override
    public Valor visitFrena(PLATAParser.FrenaContext ctx) {
        String frena = ctx.FRENA().getText();
        System.out.println("El robot empieza a frenar ejecuta el siguiente comando " + frena);
        return Valor.VACIO;
    }

    @Override
    public Valor visitGira(PLATAParser.GiraContext ctx) {
        String gira = ctx.GIRA().getText();
        Valor angulo = (Valor) visit(ctx.expr());
        System.out.println("El roboto " + gira + " " + angulo.asDouble() + " angulos");
        return Valor.VACIO;
    }

    /**
     * Evalúa una expresión de suma binaria.
     * Ambos operandos se evalúan como valores numéricos
     * y el método retorna el resultado como un nuevo {@link Valor}.
     *
     * @param ctx contexto de {@code SumaExpr}.
     * @return un {@link Valor} numérico con la suma de ambos operandos.
     */

    @Override
    public Valor visitSumaExpr(PLATAParser.SumaExprContext ctx) {
        Valor sumando1 = visit(ctx.expr(0));
        Valor sumando2 = visit(ctx.expr(1));
        System.out.println(sumando1.asDouble() + sumando2.asDouble());
        return new Valor(sumando1.asDouble() + sumando2.asDouble());
    }

    /**
     * Evalúa una expresión de resta.
     *
     * @param ctx contexto de {@code RestaExpr}.
     * @return un {@link Valor} numérico con la diferencia entre ambos operandos.
     */

    @Override
    public Valor visitRestaExpr(PLATAParser.RestaExprContext ctx) {
        Valor minuendo = visit(ctx.expr(0));
        Valor sustraendo = visit(ctx.expr(1));
        System.out.println(minuendo.asDouble() - sustraendo.asDouble());

        return new Valor(minuendo.asDouble() - sustraendo.asDouble());
    }

    /**
     * Evalúa una división entre dos expresiones numéricas.
     * Incluye validaciones de indeterminación:
     * <ul>
     *     <li>0 / 0</li>
     *     <li>x / 0</li>
     * </ul>
     *
     * @param ctx contexto de {@code DivisionExpr}.
     * @return un {@link Valor} numérico con el resultado de la división.
     * @throws PlataException si hay división entre cero.
     */

    @Override
    public Valor visitDivisionExpr(PLATAParser.DivisionExprContext ctx) {
        Valor dividendo = visit(ctx.expr(0));
        Valor divisor = visit(ctx.expr(1));

        if (dividendo.asDouble() == 0 && divisor.asDouble() == 0)
            throw new PlataException("Indeterminacion 0/0");

        if (divisor.asDouble() == 0)
            throw new PlataException("Indeterminacion " + divisor.asDouble() + " 0");

        System.out.println(dividendo.asDouble() / divisor.asDouble());

        return new Valor(dividendo.asDouble() / divisor.asDouble());
    }

    /**
     * Evalúa una multiplicación entre dos expresiones numéricas.
     *
     * @param ctx contexto de {@code MultiplicacionExpr}.
     * @return un {@link Valor} numérico con el producto.
     */

    @Override
    public Valor visitMultiplicacionExpr(PLATAParser.MultiplicacionExprContext ctx) {
        Valor factor1 = visit(ctx.expr(0));
        Valor factor2 = visit(ctx.expr(1));
        System.out.println(factor1.asDouble() * factor2.asDouble());

        return new Valor(factor1.asDouble() * factor2.asDouble());
    }

    /**
     * Evalúa una expresión entre paréntesis, simplemente delegando a la expresión interna.
     *
     * @param ctx contexto de {@code ParentesisExpr}.
     * @return el valor resultante de evaluar la expresión interna.
     */

    @Override
    public Valor visitParentesisExpr(PLATAParser.ParentesisExprContext ctx) {
        return visit(ctx.expr());
    }

    /**
     * Devuelve un valor booleano a partir del literal <code>verdadero</code> o <code>falso</code>.
     *
     * @param ctx contexto de {@code BooleanAtomico}.
     * @return un {@link Valor} booleano.
     */

    @Override
    public Valor visitBooleanAtomico(PLATAParser.BooleanAtomicoContext ctx) {
        String bool = ctx.getText();
        return new Valor(Boolean.valueOf(bool));
    }

    /**
     * Obtiene el valor asociado a un identificador previamente asignado.
     * Si la variable no existe, lanza una excepción.
     *
     * @param ctx contexto de {@code IdAtomico}.
     * @return el valor almacenado en la tabla de variables.
     * @throws PlataException si la variable no ha sido definida.
     */

    @Override
    public Valor visitIdAtomico(PLATAParser.IdAtomicoContext ctx) {
        String id = ctx.ID().getText();
        Valor valor = variables.get(id);
        if (valor == null)
            throw new PlataException("Variable no definida: " + id);

        return valor;
    }

    /**
     * Convierte un literal entero o flotante en su correspondiente {@link Valor} numérico.
     *
     * @param ctx contexto de {@code NumeroAtomico}.
     * @return un {@link Valor} conteniendo el número como double.
     */
    @Override
    public Valor visitNumeroAtomico(PLATAParser.NumeroAtomicoContext ctx) {
        String numero = ctx.getText();// !repasar
        return new Valor(Double.valueOf(numero));
    }

    /**
     * Procesa un literal de cadena, eliminando las comillas exteriores y
     * sustituyendo ocurrencias de comillas dobles escapadas.
     *
     * @param ctx contexto de {@code StringAtomico}.
     * @return un {@link Valor} con la cadena procesada.
     */
    @Override
    public Valor visitStringAtomico(PLATAParser.StringAtomicoContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Valor(str);
    }

    /**
     * Evalúa una negación lógica (<code>!expr</code>).
     *
     * @param ctx contexto de {@code NotExpr}.
     * @return un {@link Valor} booleano con el valor negado.
     */
    @Override
    public Valor visitNotExpr(PLATAParser.NotExprContext ctx) {
        Valor value = this.visit(ctx.expr());
        return new Valor(!value.asBoolean());
    }

    /**
     * Evalúa una condición lógica compuesta por dos expresiones y un
     * operador relacional o lógico (>, <, ==, !=, &&, ||, etc.).
     * <p>
     * Realiza las comparaciones numéricas usando una tolerancia para evitar
     * errores por precisión en dobles cuando corresponde.
     *
     * @param ctx contexto de {@code condicion}.
     * @return un {@link Valor} booleano con el resultado de la comparación.
     * @throws RuntimeException si el operador es desconocido.
     */ 
    @Override
    public Valor visitCondicion(PLATAParser.CondicionContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));
        
        // Obtiene el tipo de token del operador relacional/lógico
        int tipoToken = ctx.operadorCondicional().start.getType();
        
        switch (tipoToken) {
            case PLATAParser.MAYOR:
                return new Valor(opIzquierdo.asDouble() > opDerecho.asDouble());             
            case PLATAParser.MENOR:
                return new Valor(opIzquierdo.asDouble() < opDerecho.asDouble());             
            case PLATAParser.MAYOR_IGUAL:
                return new Valor(opIzquierdo.asDouble() >= opDerecho.asDouble());             
            case PLATAParser.MENOR_IGUAL:
                return new Valor(opIzquierdo.asDouble() <= opDerecho.asDouble());             
            case PLATAParser.DISTINTO:
                // Caso especial: si ambos son números, se usa comparación con tolerancia
                if(opIzquierdo.isDouble() && opDerecho.isDouble()){
                    // Se comprueba si la diferencia absoluta es mayor o igual a la tolerancia VALOR_PEQUEÑO, esto es porque son Double
                    Valor v = new Valor(Math.abs(opIzquierdo.asDouble()-opDerecho.asDouble()) >= VALOR_PEQUEÑO);
                    return v;
                } else {
                    // Si no son números, se compara usando equals
                    Valor v = new Valor(!opDerecho.equals(opIzquierdo));
                    return v;
                }
            case PLATAParser.IGUAL_QUE:
                // Caso especial: comparación con tolerancia entre números
                if(opIzquierdo.isDouble() && opDerecho.isDouble()){
                    // Son iguales si la diferencia es menor que la tolerancia
                    Valor v = new Valor(Math.abs(opIzquierdo.asDouble()-opDerecho.asDouble()) < VALOR_PEQUEÑO);
                    return v;
                } else {
                    // Para String, boolean, etc. se usa equals normal
                    Valor v = new Valor(opDerecho.equals(opIzquierdo));
                    return v;
                }
            case PLATAParser.AND:
                return new Valor(opDerecho.asBoolean() && opIzquierdo.asBoolean());
            case PLATAParser.OR:
                return new Valor(opIzquierdo.asBoolean() || opDerecho.asBoolean());

            default:
                throw new RuntimeException("Operador desconocido: " + PLATAParser.VOCABULARY.getDisplayName(tipoToken));
        }
    }

    /**
     * Evalúa y ejecuta una sentencia <b>while</b> definida en la gramática PLATA.
     * <p>
     * La estructura corresponde a:
     * <pre>
     * Mientras (condicion) {
     *     bloque
     * }
     * </pre>
     * Este método:
     * <ol>
     *   <li>Evalúa la condición inicial del bucle.</li>
     *   <li>Verifica que el resultado sea booleano; si no, lanza una {@link PlataException}.</li>
     *   <li>Mientras la condición sea verdadera, ejecuta el bloque asociado al while.</li>
     *   <li>Después de cada iteración, vuelve a evaluar la condición, permitiendo que
     *       variables internas puedan romper el bucle.</li>
     * </ol>
     *
     * El bucle se detendrá cuando la condición evaluada devuelva <code>false</code>.
     *
     * @param ctx el contexto sintáctico correspondiente a {@code bucle_while} generado por ANTLR.
     * @return siempre {@link Valor#VACIO}, ya que la ejecución del <i>while</i> no produce un valor directo.
     * @throws PlataException si la condición no devuelve un valor booleano válido.
     */

    @Override
    public Valor visitBucle_while(PLATAParser.Bucle_whileContext ctx) {
        Valor condicion = visit(ctx.condicion());
        if(condicion.asBoolean())
            throw new PlataException("La condicion del bucle no es un booleano");
        
        while(condicion.asBoolean()){
            visit(ctx.bloque());
            //La condicion se ha tenido que modificar, si no seria un bucle
            condicion=visit(ctx.condicion());
            System.out.println(" Se esta ejecutando un bucle while");
        };

        return Valor.VACIO;
        
    }

    /**
     * Evalúa una sentencia condicional compuesta por:
     * <ul>
     *     <li>Un bloque <code>if</code> con su condición.</li>
     *     <li>Cero o más bloques <code>else if</code> con sus condiciones.</li>
     *     <li>Opcionalmente un bloque <code>else</code> sin condición.</li>
     * </ul>
     *
     * <p>El funcionamiento sigue la semántica habitual de los lenguajes de programación:</p>
     * <ol>
     *     <li>Se evalúa la condición del <code>if</code>.  
     *         Si es verdadera, se ejecuta su bloque y la sentencia termina.</li>
     *     <li>Si el <code>if</code> no se ejecuta, se recorren los bloques <code>else if</code>
     *         en orden.  
     *         El primero cuya condición sea verdadera ejecuta su bloque y la sentencia termina.</li>
     *     <li>Si ninguna condición fue verdadera y existe un <code>else</code>, se ejecuta su bloque.</li>
     * </ol>
     *
     * <p>Solo se ejecuta un único bloque (if / else-if / else).  
     * Siempre devuelve <code>Valor.VACIO</code> ya que una sentencia <code>if</code> 
     * no produce un valor computable.</p>
     *
     * @param ctx El contexto del árbol sintáctico que representa la sentencia IF.
     * @return <code>Valor.VACIO</code> (la sentencia no devuelve un resultado útil).
     */

    @Override
    public Valor visitIf_sentencia(PLATAParser.If_sentenciaContext ctx) {
        // IF principal
        Valor primeraCondicion = visit(ctx.condicion(0));
        if(primeraCondicion.asBoolean()){
            visit(ctx.bloque(0));
            return Valor.VACIO;
        }

        // Todos los IF ELSE
        int totalCondiciones = ctx.condicion().size(); // incluye las del IF y los ELSE_IF
        int totalBloques = ctx.bloque().size(); // incluye el del IF, ELSE_IF(s) y ELSE

        for(int i=1; i<totalCondiciones;i++){
            Valor elseIfCondiciones = visit(ctx.condicion(i));
            if(elseIfCondiciones.asBoolean()){
                visit(ctx.bloque(i));
                return Valor.VACIO;
            }
        }

        //Else si existe
        if (totalBloques>totalCondiciones) {
            //-1 porque empiezas en el indice 0, y .size() devuelve el numero total de elementos que hay
            visit(ctx.bloque(totalBloques - 1)); 
        }
        return Valor.VACIO;
    }

}