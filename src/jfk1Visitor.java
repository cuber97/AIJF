// Generated from jfk1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jfk1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jfk1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(jfk1Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#listT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListT(jfk1Parser.ListTContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#operationsReturningList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationsReturningList(jfk1Parser.OperationsReturningListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#operationsReturningNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationsReturningNumber(jfk1Parser.OperationsReturningNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#expressionsReturningList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsReturningList(jfk1Parser.ExpressionsReturningListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#expressionsReturningNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsReturningNumber(jfk1Parser.ExpressionsReturningNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(jfk1Parser.ExpressionContext ctx);
}