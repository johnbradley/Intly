// Generated from Intly.g4 by ANTLR 4.1
package intly.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IntlyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IntlyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IntlyParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(@NotNull IntlyParser.MultExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(@NotNull IntlyParser.ValueExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull IntlyParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull IntlyParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(@NotNull IntlyParser.ReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull IntlyParser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#geExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeExpr(@NotNull IntlyParser.GeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#ltExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(@NotNull IntlyParser.LtExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#funcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(@NotNull IntlyParser.FuncExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#fdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdecl(@NotNull IntlyParser.FdeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull IntlyParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull IntlyParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(@NotNull IntlyParser.SubExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#gtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(@NotNull IntlyParser.GtExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull IntlyParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#fparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFparams(@NotNull IntlyParser.FparamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull IntlyParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(@NotNull IntlyParser.AddExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#leExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeExpr(@NotNull IntlyParser.LeExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(@NotNull IntlyParser.EqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link IntlyParser#divExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(@NotNull IntlyParser.DivExprContext ctx);
}