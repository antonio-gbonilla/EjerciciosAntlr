import java.util.LinkedHashMap;
import java.util.Map;

public class MiVisitor extends PLATABaseVisitor<Valor> {



    Map<String, Valor> variables = new LinkedHashMap<>();

    @Override
    public Valor visitAsignacion(PLATAParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        Valor valor = (Valor) visit(ctx.expr());

        variables.put(nombre, valor);
        System.out.println("El Value de la variable " + nombre + " es " + valor);

        return ;
    }

    @Override
    public Valor visitAvanza(PLATAParser.AvanzaContext ctx) {
        String avanza = ctx.AVANZA().getText();
        Valor valor1 = (Valor) visit(ctx.expr(0));
        Valor valor2 = (Valor) visit(ctx.expr(1));
        System.out.println("El roboto " +avanza +" " + valor1.asDouble() +
                " metros a una velicidad de " + valor2.asDouble() + " m/s");
        return ;
    }

    
    @Override
    public Valor visitFrena(PLATAParser.FrenaContext ctx) {
        String frena = ctx.FRENA().getText();
                System.out.println("El robot empieza a frenar ejecuta el siguiente comando " + frena);
        return ;
    }

    @Override
    public Valor visitGira(PLATAParser.GiraContext ctx) {
        String gira = ctx.GIRA().getText();
        Valor angulo = (Valor) visit(ctx.expr());
                System.out.println("El roboto " +gira +" " + angulo.asDouble() + " angulos");
        return ;
    }


    @Override
    public Valor visitVariableExpr(PLATAParser.VariableExprContext ctx) {
        String id = ctx.ID().getText();
        Valor valor = variables.get(id);
        if (valor == null)
            throw new PlataException("Variable no definida: " + id);

        return valor;
    }

    //!Modificar
    @Override
    public Object visitNumero(PLATAParser.NumeroContext ctx) {
        if (ctx.INT() != null)
            return Double.valueOf(ctx.INT().getText());

        return Double.valueOf(ctx.FLOAT().getText());
    }


    @Override
    public Valor visitDivision(PLATAParser.DivisionContext ctx) {//!! indeterminacion
        Valor dividendo = visit(ctx.expr(0));
        Valor divisor = visit(ctx.expr(1));
        
        if (dividendo.asDouble()==0 && divisor.asDouble()==0) 
            throw new PlataException("Indeterminacion 0/0");
        
        if (divisor.asDouble()==0) 
            throw new PlataException("Indeterminacion " + divisor.asDouble() +" 0");
        
                System.out.println(dividendo.asDouble()/divisor.asDouble());

        return dividendo.asDouble()/divisor.asDouble();
    }
    
    @Override
    public Valor v

    @Override
    public Valor visitMultiplicacion(PLATAParser.MultiplicacionContext ctx) {
        Valor factor1 = visit(ctx.expr(0));
        Valor factor2 = visit(ctx.expr(1));
                System.out.println(factor1.asDouble()*factor2.asDouble());

        return factor1.asDouble()*factor2.asDouble();
    }

    @Override
    public Valor visitResta(PLATAParser.RestaContext ctx) {
        Valor minuendo = visit(ctx.expr(0));
        Valor sustraendo = visit(ctx.expr(1));
                System.out.println(minuendo.asDouble()-sustraendo.asDouble());

        return minuendo.asDouble()-sustraendo.asDouble();
    }

    @Override
    public Valor visitSuma(PLATAParser.SumaContext ctx) {
        Valor sumando1 = visit(ctx.expr(0));
        Valor sumando2 = visit(ctx.expr(1));
        System.out.println(sumando1.asDouble()+sumando2.asDouble());
        return sumando1.asDouble()+sumando2.asDouble();
    }

    @Override
    public Valor visitParentesis(PLATAParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }


    @Override
    public Object visitBucle_while(PLATAParser.Bucle_whileContext ctx) {
        Valor condicion = visit(ctx.condicion());
        if(condicion.asBoolean())
            throw new PlataException("La condicion del bucle no es un booleano")
        
        while(condicion.asBoolean()){
            visit(ctx.bloque());
        };

        System.out.println(" Se esta ejecutando un bucle while");
    }

    @Override
    public Object visitCondicion(PLATAParser.CondicionContext ctx) {
        Valor opIzquierdo = visit(ctx.expr(0));
        Valor opDerecho = visit(ctx.expr(1));
        int tipoToken = ctx.operadorCondicional().start.getType();
        
        switch (tipoToken) {
            case PLATAParser.MAYOR:
                return new Valor(opIzquierdo.asDouble() > opDerecho.asDouble());             
                break;
            case PLATAParser.MENOR:
                return new Valor(opIzquierdo.asDouble() < opDerecho.asDouble());             
                break;
            case PLATAParser.MAYOR_IGUAL:
                return new Valor(opIzquierdo.asDouble() >= opDerecho.asDouble());             
                break;
            case PLATAParser.MENOR_IGUAL:
                return new Valor(opIzquierdo.asDouble() <= opDerecho.asDouble());             
                break;
            case PLATAParser.DISTINTO:
                return new Valor(opIzquierdo.asDouble() != opDerecho.asDouble());             
                break;
            case PLATAParser.IGUAL_QUE:
                return new Valor(opIzquierdo.asDouble() == opDerecho.asDouble());             
                break;
            default:
                throw new RuntimeException("Operador desconocido: " + PLATAParser.VOCABULARY.getDisplayName(tipoToken));
                break;
        }
    }    
}