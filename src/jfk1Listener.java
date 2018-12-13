// Generated from jfk1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jfk1Parser}.
 */
public interface jfk1Listener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link jfk1Parser#listBase}.
	 * @param ctx the parse tree
	 */
	void enterListBase(jfk1Parser.ListBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#listBase}.
	 * @param ctx the parse tree
	 */
	void exitListBase(jfk1Parser.ListBaseContext ctx);
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
	 * Enter a parse tree produced by {@link jfk1Parser#basicExpressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpressionsReturningList(jfk1Parser.BasicExpressionsReturningListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#basicExpressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpressionsReturningList(jfk1Parser.BasicExpressionsReturningListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#extendedExpressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedExpressionsReturningList(jfk1Parser.ExtendedExpressionsReturningListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#extendedExpressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedExpressionsReturningList(jfk1Parser.ExtendedExpressionsReturningListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#basicExpressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpressionsReturningNumber(jfk1Parser.BasicExpressionsReturningNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#basicExpressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpressionsReturningNumber(jfk1Parser.BasicExpressionsReturningNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfk1Parser#extendedExpressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void enterExtendedExpressionsReturningNumber(jfk1Parser.ExtendedExpressionsReturningNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfk1Parser#extendedExpressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void exitExtendedExpressionsReturningNumber(jfk1Parser.ExtendedExpressionsReturningNumberContext ctx);
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