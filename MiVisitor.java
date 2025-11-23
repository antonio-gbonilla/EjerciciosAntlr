import java.util.LinkedHashMap;
import java.util.Map;

public class MiVisitor extends PLATA2BaseVisitor<Object> {

    Map<String, Integer> variables = new LinkedHashMap<>();

    @Override
    public Object visitAsignacion(PLATA2Parser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        int valor = (Integer) visit(ctx.expr());

        variables.put(nombre, valor);
        System.out.println("El valor de la variable " + nombre + " es " + valor);

        return null;
    }

    @Override
    public Object visitAvanza(PLATA2Parser.AvanzaContext ctx) {
        Integer valor1 = (Integer) visit(ctx.expr(0));
        Integer valor2 = (Integer) visit(ctx.expr(1));
        System.out.println("El roboto avanzara " + valor1 +
                " metros a una velicidad de " + valor2 + " m/s");
        return null;
    }

    @Override
    public Object visitVariableExpr(PLATA2Parser.VariableExprContext ctx) {
        String id = ctx.ID().getText();
        Integer valor = variables.get(id);
        if (valor == null)
            throw new RuntimeException("Variable no definida: " + id);

        return valor;
    }

    @Override
    public Object visitEntero(PLATA2Parser.EnteroContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Object visitDivision(PLATA2Parser.DivisionContext ctx) {
        Integer dividendo = (Integer)visit(ctx.expr(0));
        Integer divisor = (Integer)visit(ctx.expr(1));
                System.out.println(dividendo/divisor);

        return dividendo/divisor;
    }

    @Override
    public Object visitMultiplicacion(PLATA2Parser.MultiplicacionContext ctx) {
        Integer factor1 = (Integer)visit(ctx.expr(0));
        Integer factor2 = (Integer)visit(ctx.expr(1));
                System.out.println(factor1*factor2);

        return factor1*factor2;
    }

    @Override
    public Object visitResta(PLATA2Parser.RestaContext ctx) {
        Integer minuendo = (Integer)visit(ctx.expr(0));
        Integer sustraendo = (Integer)visit(ctx.expr(1));
                System.out.println(minuendo-sustraendo);

        return minuendo-sustraendo;
    }

    @Override
    public Object visitSuma(PLATA2Parser.SumaContext ctx) {
        Integer sumando1 = (Integer)visit(ctx.expr(0));
        Integer sumando2 = (Integer)visit(ctx.expr(1));
        System.out.println(sumando1+sumando2);
        return sumando1+sumando2;
    }

    @Override
    public Object visitParentesis(PLATA2Parser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitPotencia(PLATA2Parser.PotenciaContext ctx) {
        Integer base = (Integer) visit(ctx.expr(0));
        Integer exponente = (Integer) visit(ctx.expr(1));
        Integer resultado = (int) Math.pow(base, exponente);
        System.out.println(resultado);
        return resultado;
    }

}