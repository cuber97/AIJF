// Generated from Jfk1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Jfk1Parser}.
 */
public interface Jfk1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#pNumber}.
	 * @param ctx the parse tree
	 */
	void enterPNumber(Jfk1Parser.PNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#pNumber}.
	 * @param ctx the parse tree
	 */
	void exitPNumber(Jfk1Parser.PNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#mNumber}.
	 * @param ctx the parse tree
	 */
	void enterMNumber(Jfk1Parser.MNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#mNumber}.
	 * @param ctx the parse tree
	 */
	void exitMNumber(Jfk1Parser.MNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Jfk1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Jfk1Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#listT}.
	 * @param ctx the parse tree
	 */
	void enterListT(Jfk1Parser.ListTContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#listT}.
	 * @param ctx the parse tree
	 */
	void exitListT(Jfk1Parser.ListTContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#operationsReturningList}.
	 * @param ctx the parse tree
	 */
	void enterOperationsReturningList(Jfk1Parser.OperationsReturningListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#operationsReturningList}.
	 * @param ctx the parse tree
	 */
	void exitOperationsReturningList(Jfk1Parser.OperationsReturningListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void enterOperationsReturningNumber(Jfk1Parser.OperationsReturningNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void exitOperationsReturningNumber(Jfk1Parser.OperationsReturningNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#expressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsReturningList(Jfk1Parser.ExpressionsReturningListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#expressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsReturningList(Jfk1Parser.ExpressionsReturningListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsReturningNumber(Jfk1Parser.ExpressionsReturningNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsReturningNumber(Jfk1Parser.ExpressionsReturningNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jfk1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Jfk1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jfk1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Jfk1Parser.ExpressionContext ctx);
}