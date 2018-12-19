// Generated from jfk1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jfk1Parser}.
 */
public interface jfk1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#pNumber}.
	 * @param ctx the parse tree
	 */
	void enterPNumber(jfk1Parser.PNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#pNumber}.
	 * @param ctx the parse tree
	 */
	void exitPNumber(jfk1Parser.PNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#mNumber}.
	 * @param ctx the parse tree
	 */
	void enterMNumber(jfk1Parser.MNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#mNumber}.
	 * @param ctx the parse tree
	 */
	void exitMNumber(jfk1Parser.MNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(jfk1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(jfk1Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#listT}.
	 * @param ctx the parse tree
	 */
	void enterListT(jfk1Parser.ListTContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#listT}.
	 * @param ctx the parse tree
	 */
	void exitListT(jfk1Parser.ListTContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#operationsReturningList}.
	 * @param ctx the parse tree
	 */
	void enterOperationsReturningList(jfk1Parser.OperationsReturningListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#operationsReturningList}.
	 * @param ctx the parse tree
	 */
	void exitOperationsReturningList(jfk1Parser.OperationsReturningListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void enterOperationsReturningNumber(jfk1Parser.OperationsReturningNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void exitOperationsReturningNumber(jfk1Parser.OperationsReturningNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#expressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsReturningList(jfk1Parser.ExpressionsReturningListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#expressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsReturningList(jfk1Parser.ExpressionsReturningListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsReturningNumber(jfk1Parser.ExpressionsReturningNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsReturningNumber(jfk1Parser.ExpressionsReturningNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(jfk1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(jfk1Parser.ExpressionContext ctx);
}