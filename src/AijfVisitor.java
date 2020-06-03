// Generated from Aijf.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AijfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AijfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AijfParser#pNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPNumber(AijfParser.PNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AijfParser#mNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMNumber(AijfParser.MNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AijfParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AijfParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AijfParser#listT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListT(AijfParser.ListTContext ctx);
	/**
	 * Visit a parse tree produced by {@link AijfParser#operationsReturningList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationsReturningList(AijfParser.OperationsReturningListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AijfParser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationsReturningNumber(AijfParser.OperationsReturningNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AijfParser#expressionsReturningList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsReturningList(AijfParser.ExpressionsReturningListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AijfParser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsReturningNumber(AijfParser.ExpressionsReturningNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AijfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AijfParser.ExpressionContext ctx);
}