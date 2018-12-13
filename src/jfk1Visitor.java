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
	 * Visit a parse tree produced by {@link jfk1Parser#listBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBase(jfk1Parser.ListBaseContext ctx);
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
	 * Visit a parse tree produced by {@link jfk1Parser#basicExpressionsReturningList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpressionsReturningList(jfk1Parser.BasicExpressionsReturningListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#extendedExpressionsReturningList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedExpressionsReturningList(jfk1Parser.ExtendedExpressionsReturningListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#basicExpressionsReturningNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpressionsReturningNumber(jfk1Parser.BasicExpressionsReturningNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#extendedExpressionsReturningNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedExpressionsReturningNumber(jfk1Parser.ExtendedExpressionsReturningNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfk1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(jfk1Parser.ExpressionContext ctx);
}