// Generated from ./PLATA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLATAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLATAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLATAParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PLATAParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(PLATAParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#avanza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvanza(PLATAParser.AvanzaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#gira}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGira(PLATAParser.GiraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#frena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrena(PLATAParser.FrenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PLATAParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#if_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sentencia(PLATAParser.If_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#bucle_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_while(PLATAParser.Bucle_whileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(PLATAParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(PLATAParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(PLATAParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(PLATAParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(PLATAParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nnumero}
	 * labeled alternative in {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNnumero(PLATAParser.NnumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(PLATAParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(PLATAParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(PLATAParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(PLATAParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#operadorCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorCondicional(PLATAParser.OperadorCondicionalContext ctx);
}