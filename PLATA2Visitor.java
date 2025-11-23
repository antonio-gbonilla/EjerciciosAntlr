// Generated from ./PLATA2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLATA2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLATA2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLATA2Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PLATA2Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATA2Parser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(PLATA2Parser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATA2Parser#avanza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvanza(PLATA2Parser.AvanzaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATA2Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PLATA2Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link PLATA2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(PLATA2Parser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Entero}
	 * labeled alternative in {@link PLATA2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(PLATA2Parser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link PLATA2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(PLATA2Parser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link PLATA2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(PLATA2Parser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link PLATA2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(PLATA2Parser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Potencia}
	 * labeled alternative in {@link PLATA2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(PLATA2Parser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link PLATA2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(PLATA2Parser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link PLATA2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(PLATA2Parser.RestaContext ctx);
}