// Generated from Intly.g4 by ANTLR 4.1
package intly.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntlyParser}.
 */
public interface IntlyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntlyParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull IntlyParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull IntlyParser.MultExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(@NotNull IntlyParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(@NotNull IntlyParser.ValueExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull IntlyParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull IntlyParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull IntlyParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull IntlyParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull IntlyParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull IntlyParser.ReturnContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull IntlyParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull IntlyParser.ParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#geExpr}.
	 * @param ctx the parse tree
	 */
	void enterGeExpr(@NotNull IntlyParser.GeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#geExpr}.
	 * @param ctx the parse tree
	 */
	void exitGeExpr(@NotNull IntlyParser.GeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#ltExpr}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(@NotNull IntlyParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#ltExpr}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(@NotNull IntlyParser.LtExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(@NotNull IntlyParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(@NotNull IntlyParser.FuncExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#var_or_int}.
	 * @param ctx the parse tree
	 */
	void enterVar_or_int(@NotNull IntlyParser.Var_or_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#var_or_int}.
	 * @param ctx the parse tree
	 */
	void exitVar_or_int(@NotNull IntlyParser.Var_or_intContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#fdecl}.
	 * @param ctx the parse tree
	 */
	void enterFdecl(@NotNull IntlyParser.FdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#fdecl}.
	 * @param ctx the parse tree
	 */
	void exitFdecl(@NotNull IntlyParser.FdeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull IntlyParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull IntlyParser.WhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull IntlyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull IntlyParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(@NotNull IntlyParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(@NotNull IntlyParser.SubExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#gtExpr}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(@NotNull IntlyParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#gtExpr}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(@NotNull IntlyParser.GtExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull IntlyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull IntlyParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#fparams}.
	 * @param ctx the parse tree
	 */
	void enterFparams(@NotNull IntlyParser.FparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#fparams}.
	 * @param ctx the parse tree
	 */
	void exitFparams(@NotNull IntlyParser.FparamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull IntlyParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull IntlyParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(@NotNull IntlyParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(@NotNull IntlyParser.AddExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#leExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeExpr(@NotNull IntlyParser.LeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#leExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeExpr(@NotNull IntlyParser.LeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(@NotNull IntlyParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(@NotNull IntlyParser.EqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IntlyParser#divExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(@NotNull IntlyParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntlyParser#divExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(@NotNull IntlyParser.DivExprContext ctx);
}