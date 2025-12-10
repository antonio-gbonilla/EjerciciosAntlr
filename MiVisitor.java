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
        System.out.println("El roboto " + gira + " " + angulo.asDouble() + " angulos");
        return Valor.VACIO;
    }

    @Override
    public Valor visitSumaExpr(PLATAParser.SumaExprContext ctx) {
        Valor sumando1 = visit(ctx.expr(0));
        Valor sumando2 = visit(ctx.expr(1));
        System.out.println(sumando1.asDouble() + sumando2.asDouble());
        return new Valor(sumando1.asDouble() + sumando2.asDouble());
    }

    @Override
    public Valor visitRestaExpr(PLATAParser.RestaExprContext ctx) {
        Valor minuendo = visit(ctx.expr(0));
        Valor sustraendo = visit(ctx.expr(1));
        System.out.println(minuendo.asDouble() - sustraendo.asDouble());

        return new Valor(minuendo.asDouble() - sustraendo.asDouble());
    }

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

    @Override
    public Valor visitMultiplicacionExpr(PLATAParser.MultiplicacionExprContext ctx) {
        Valor factor1 = visit(ctx.expr(0));
        Valor factor2 = visit(ctx.expr(1));
        System.out.println(factor1.asDouble() * factor2.asDouble());

        return new Valor(factor1.asDouble() * factor2.asDouble());
    }

    @Override
    public Valor visitParentesisExpr(PLATAParser.ParentesisExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Valor visitBooleanAtomico(PLATAParser.BooleanAtomicoContext ctx) {
        String bool = ctx.getText();
        return new Valor(Boolean.valueOf(bool));
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
        String numero = ctx.getText();// !repasar
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
    public Valor visitCondicion(PLATAParser.CondicionContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));
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
                if(opIzquierdo.isDouble() && opDerecho.isDouble()){
                    Valor v = new Valor(Math.abs(opIzquierdo.asDouble()-opDerecho.asDouble()) >= VALOR_PEQUEÑO);
                    return v;
                } else {
                    Valor v = new Valor(!opDerecho.equals(opIzquierdo));
                    return v;
                }
            case PLATAParser.IGUAL_QUE:
                if(opIzquierdo.isDouble() && opDerecho.isDouble()){
                    Valor v = new Valor(Math.abs(opIzquierdo.asDouble()-opDerecho.asDouble()) < VALOR_PEQUEÑO);
                    return v;
                } else {
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

    @Override
    public Valor visitIf_sentencia(PLATAParser.If_sentenciaContext ctx) {
        // TODO Auto-generated method stub
        return super.visitIf_sentencia(ctx);
    }

}