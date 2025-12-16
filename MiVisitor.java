import java.util.LinkedHashMap;
import java.util.Map;

public class MiVisitor extends PLATABaseVisitor<Valor> {

    public static final double VALOR_PEQUEÑO = 0.00000000001;
    private Map<String, Valor> variables = new LinkedHashMap<>();

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
        System.out.println("El roboto " + gira + " " + angulo.asDouble() + " grados");
        return Valor.VACIO;
    }

    @Override
    public Valor visitSumaExpr(PLATAParser.SumaExprContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case PLATAParser.SUMA:
                if (opIzquierdo.isString() || opDerecho.isString()) {
                    System.out.println(opIzquierdo.asString() + opDerecho.asString());
                    return new Valor(opIzquierdo.asString() + opDerecho.asString());
                }
                System.out.println(opIzquierdo.asDouble() + opDerecho.asDouble());
                return new Valor(opIzquierdo.asDouble() + opDerecho.asDouble());

            case PLATAParser.MENOS:
                System.out.println(opIzquierdo.asDouble() - opDerecho.asDouble());

                return new Valor(opIzquierdo.asDouble() - opDerecho.asDouble());
            default:
                throw new RuntimeException(
                        "Operador desconocido: " + PLATAParser.VOCABULARY.getDisplayName(ctx.op.getType()));

        }
    }

    @Override
    public Valor visitMultiplicacionExpr(PLATAParser.MultiplicacionExprContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case PLATAParser.MULTIPLICACION:
                System.out.println(opIzquierdo.asDouble() * opDerecho.asDouble());
                return new Valor(opIzquierdo.asDouble() * opDerecho.asDouble());
            case PLATAParser.DIVISION:

                if (Math.abs(opIzquierdo.asDouble()) < VALOR_PEQUEÑO && Math.abs(opDerecho.asDouble()) < VALOR_PEQUEÑO)
                    throw new PlataException("Indeterminacion 0/0");

                if (Math.abs(opDerecho.asDouble()) < VALOR_PEQUEÑO)
                    throw new PlataException("Indeterminacion el denominador " + ctx.expr(1).getText() + " = 0");

                System.out.println(opIzquierdo.asDouble() / opDerecho.asDouble());

                return new Valor(opIzquierdo.asDouble() / opDerecho.asDouble());
            case PLATAParser.MODULO:
                if (Math.abs(opDerecho.asDouble()) < VALOR_PEQUEÑO)
                    throw new PlataException("Modulo por cero");

                return new Valor(opIzquierdo.asDouble() % opDerecho.asDouble());
            default:
                throw new RuntimeException(
                        "Operador desconocido: " + PLATAParser.VOCABULARY.getDisplayName(ctx.op.getType()));
        }

    }

    @Override
    public Valor visitParentesisExpr(PLATAParser.ParentesisExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Valor visitBooleanAtomico(PLATAParser.BooleanAtomicoContext ctx) {
        String bool = ctx.getText();
        // Ponemos en mayusculas la primera letra
        String normalizado = Character.toUpperCase(bool.charAt(0)) + bool.substring(1);
        switch (normalizado) {
            case "Verdadero":
                return new Valor(true);

            case "Falso":
                return new Valor(false);

            default:
                throw new PlataException("Booleano inválido: " + ctx.getText());
        }
    }

    @Override
    public Valor visitIdAtomico(PLATAParser.IdAtomicoContext ctx) {
        String id = ctx.ID().getText();
        Valor valor = variables.get(id);
        if (valor == null)
            throw new PlataException("Variable no definida: " + id);

        return valor;
    }

    @Override
    public Valor visitNumeroAtomico(PLATAParser.NumeroAtomicoContext ctx) {
        String numero = ctx.getText();
        return new Valor(Double.valueOf(numero));
    }

    @Override
    public Valor visitStringAtomico(PLATAParser.StringAtomicoContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Valor(str);
    }

    @Override
    public Valor visitNotExpr(PLATAParser.NotExprContext ctx) {
        Valor value = this.visit(ctx.expr());
        return new Valor(!value.asBoolean());
    }

    
    @Override
    public Valor visitMenosExpr(PLATAParser.MenosExprContext ctx) {
        Valor valor = visit(ctx.expr());
        if (valor.isDouble())
            return new Valor(valor.asDouble() * (-1));
        else
            throw new PlataException("Quieres poner un numero negativo que no es un numero: " + valor);
    }

    @Override
    public Valor visitRelacionesExpr(PLATAParser.RelacionesExprContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case PLATAParser.MENOR:
                return new Valor(opIzquierdo.asDouble() < opDerecho.asDouble());
            case PLATAParser.MAYOR:
                return new Valor(opIzquierdo.asDouble() > opDerecho.asDouble());
            case PLATAParser.MAYOR_IGUAL:
                return new Valor(opIzquierdo.asDouble() >= opDerecho.asDouble());
            case PLATAParser.MENOR_IGUAL:
                return new Valor(opIzquierdo.asDouble() <= opDerecho.asDouble());
            default:
                throw new PlataException(
                        "Operador desconocido: " + PLATAParser.VOCABULARY.getDisplayName(ctx.op.getType()));
        }

    }

    @Override
    public Valor visitAndExpr(PLATAParser.AndExprContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));
        boolean izq = opIzquierdo.isBoolean() ? opIzquierdo.asBoolean() : opIzquierdo.asDouble() != 0;
        boolean der = opDerecho.isBoolean() ? opDerecho.asBoolean() : opDerecho.asDouble() != 0;
        return new Valor(izq && der);
    }

    @Override
    public Valor visitIgualdadesExpr(PLATAParser.IgualdadesExprContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case PLATAParser.IGUAL_QUE:
                // Caso especial: comparación con tolerancia entre números
                if (opIzquierdo.isDouble() && opDerecho.isDouble()) {
                    // Son iguales si la diferencia es menor que la tolerancia
                    Valor v = new Valor(Math.abs(opIzquierdo.asDouble() - opDerecho.asDouble()) < VALOR_PEQUEÑO);
                    return v;
                } else {
                    // Para String, boolean, etc. se usa equals normal
                    Valor v = new Valor(opDerecho.equals(opIzquierdo));
                    return v;
                }
            case PLATAParser.DISTINTO:
                // Caso especial: si ambos son números, se usa comparación con tolerancia
                if (opIzquierdo.isDouble() && opDerecho.isDouble()) {
                    // Se comprueba si la diferencia absoluta es mayor o igual a la tolerancia
                    // VALOR_PEQUEÑO, esto es porque son Double
                    Valor v = new Valor(Math.abs(opIzquierdo.asDouble() - opDerecho.asDouble()) >= VALOR_PEQUEÑO);
                    return v;
                } else {
                    // Si no son números, se compara usando equals
                    Valor v = new Valor(!opDerecho.equals(opIzquierdo));
                    return v;
                }
            default:
                throw new PlataException(
                        "Operador desconocido: " + PLATAParser.VOCABULARY.getDisplayName(ctx.op.getType()));

        }
    }

    @Override
    public Valor visitORExpr(PLATAParser.ORExprContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));

        boolean izq1 = opIzquierdo.isBoolean() ? opIzquierdo.asBoolean() : opIzquierdo.asDouble() != 0;
        boolean der2 = opDerecho.isBoolean() ? opDerecho.asBoolean() : opDerecho.asDouble() != 0;
        return new Valor(izq1 || der2);
    }


    @Override
    public Valor visitBucle_while(PLATAParser.Bucle_whileContext ctx) {
        Valor condicion = visit(ctx.expr());
        if (!condicion.isBoolean())
            throw new PlataException("La condicion del bucle no es un booleano");

        while (condicion.asBoolean()) {
            visit(ctx.bloque());
            // La condicion se ha tenido que modificar, si no seria un bucle
            condicion = visit(ctx.expr());
            System.out.println(" Se esta ejecutando un bucle while");
        }

        return Valor.VACIO;

    }

    @Override
    public Valor visitIf_sentencia(PLATAParser.If_sentenciaContext ctx) {
        // IF principal
        Valor primeraCondicion = visit(ctx.expr(0));
        if (!primeraCondicion.isBoolean()) {
            throw new PlataException("La condicion del IF no es booleana");
        }
        if (primeraCondicion.asBoolean()) {
            System.out.println("estas dentro del if");
            visit(ctx.bloque(0));
            return Valor.VACIO;
        }

        // Todos los IF ELSE
        int totalCondiciones = ctx.expr().size(); // incluye las del IF y los ELSE_IF
        int totalBloques = ctx.bloque().size(); // incluye el del IF, ELSE_IF(s) y ELSE

        for (int i = 1; i < totalCondiciones; i++) {
            Valor condicionElseIf = visit(ctx.expr(i));
            if (!condicionElseIf.isBoolean())
                throw new PlataException("La condicion del ELSE IF no es booleana");

            if (condicionElseIf.asBoolean()) {
                System.out.println("estas dentro del else if");
                visit(ctx.bloque(i));
                return Valor.VACIO;
            }
        }

        // Else si existe
        if (totalBloques > totalCondiciones) {
            System.out.println("estas dentro del else");

            // -1 porque empiezas en el indice 0, y .size() devuelve el numero total de
            // elementos que hay
            visit(ctx.bloque(totalBloques - 1));
        }
        return Valor.VACIO;
    }


}