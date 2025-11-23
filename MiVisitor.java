import java.util.LinkedHashMap;
import java.util.Map;

public class MiVisitor extends PLATA2BaseVisitor<Object> {


    Map<String, Double> variables = new LinkedHashMap<>();

    @Override
    public Object visitAsignacion(PLATA2Parser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        Double valor = (Double) visit(ctx.expr());

        variables.put(nombre, valor);
        System.out.println("El valor de la variable " + nombre + " es " + valor);

        return null;
    }

    @Override
    public Object visitAvanza(PLATA2Parser.AvanzaContext ctx) {
        Double valor1 = (Double) visit(ctx.expr(0));
        Double valor2 = (Double) visit(ctx.expr(1));
        System.out.println("El roboto avanzara " + valor1 +
                " metros a una velicidad de " + valor2 + " m/s");
        return null;
    }

    @Override
    public Object visitVariableExpr(PLATA2Parser.VariableExprContext ctx) {
        String id = ctx.ID().getText();
        Double valor = variables.get(id);
        if (valor == null)
            throw new RuntimeException("Variable no definida: " + id);

        return valor;
    }

    
    @Override
    public Object visitNumero(PLATA2Parser.NumeroContext ctx) {
        if (ctx.INT() != null)
            return Double.valueOf(ctx.INT().getText());

        return Double.valueOf(ctx.FLOAT().getText());
    }

    @Override
    public Object visitDivision(PLATA2Parser.DivisionContext ctx) {
        Double dividendo = (Double)visit(ctx.expr(0));
        Double divisor = (Double)visit(ctx.expr(1));
                System.out.println(dividendo/divisor);

        return dividendo/divisor;
    }

    @Override
    public Object visitMultiplicacion(PLATA2Parser.MultiplicacionContext ctx) {
        Double factor1 = (Double)visit(ctx.expr(0));
        Double factor2 = (Double)visit(ctx.expr(1));
                System.out.println(factor1*factor2);

        return factor1*factor2;
    }

    @Override
    public Object visitResta(PLATA2Parser.RestaContext ctx) {
        Double minuendo = (Double)visit(ctx.expr(0));
        Double sustraendo = (Double)visit(ctx.expr(1));
                System.out.println(minuendo-sustraendo);

        return minuendo-sustraendo;
    }

    @Override
    public Object visitSuma(PLATA2Parser.SumaContext ctx) {
        Double sumando1 = (Double)visit(ctx.expr(0));
        Double sumando2 = (Double)visit(ctx.expr(1));
        System.out.println(sumando1+sumando2);
        return sumando1+sumando2;
    }

    @Override
    public Object visitParentesis(PLATA2Parser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitPotencia(PLATA2Parser.PotenciaContext ctx) {
        Double base = (Double) visit(ctx.expr(0));
        Double exponente = (Double) visit(ctx.expr(1));
        Double resultado = Math.pow(base, exponente);
        System.out.println(resultado);
        return resultado;
    }

}