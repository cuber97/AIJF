// Generated from Aijf.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AijfParser}.
 */
public interface AijfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AijfParser#pNumber}.
	 * @param ctx the parse tree
	 */
	void enterPNumber(AijfParser.PNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#pNumber}.
	 * @param ctx the parse tree
	 */
	void exitPNumber(AijfParser.PNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AijfParser#mNumber}.
	 * @param ctx the parse tree
	 */
	void enterMNumber(AijfParser.MNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#mNumber}.
	 * @param ctx the parse tree
	 */
	void exitMNumber(AijfParser.MNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AijfParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AijfParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AijfParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AijfParser#listT}.
	 * @param ctx the parse tree
	 */
	void enterListT(AijfParser.ListTContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#listT}.
	 * @param ctx the parse tree
	 */
	void exitListT(AijfParser.ListTContext ctx);
	/**
	 * Enter a parse tree produced by {@link AijfParser#operationsReturningList}.
	 * @param ctx the parse tree
	 */
	void enterOperationsReturningList(AijfParser.OperationsReturningListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#operationsReturningList}.
	 * @param ctx the parse tree
	 */
	void exitOperationsReturningList(AijfParser.OperationsReturningListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AijfParser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void enterOperationsReturningNumber(AijfParser.OperationsReturningNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void exitOperationsReturningNumber(AijfParser.OperationsReturningNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AijfParser#expressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsReturningList(AijfParser.ExpressionsReturningListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#expressionsReturningList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsReturningList(AijfParser.ExpressionsReturningListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AijfParser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsReturningNumber(AijfParser.ExpressionsReturningNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsReturningNumber(AijfParser.ExpressionsReturningNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AijfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AijfParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AijfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AijfParser.ExpressionContext ctx);
}