// Generated from Jfk1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Jfk1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Jfk1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#pNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPNumber(Jfk1Parser.PNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#mNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMNumber(Jfk1Parser.MNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Jfk1Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#listT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListT(Jfk1Parser.ListTContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#operationsReturningList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationsReturningList(Jfk1Parser.OperationsReturningListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationsReturningNumber(Jfk1Parser.OperationsReturningNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#expressionsReturningList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsReturningList(Jfk1Parser.ExpressionsReturningListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsReturningNumber(Jfk1Parser.ExpressionsReturningNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jfk1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Jfk1Parser.ExpressionContext ctx);
}