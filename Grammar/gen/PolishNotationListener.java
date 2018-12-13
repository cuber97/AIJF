// Generated from /home/dev/Pobrane/drive-download-20181210T212045Z-001/Grammar.IntelliJIdea/Grammar/PolishNotation.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolishNotationParser}.
 */
public interface PolishNotationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PolishNotationParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PolishNotationParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishNotationParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PolishNotationParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishNotationParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(PolishNotationParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishNotationParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(PolishNotationParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishNotationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PolishNotationParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishNotationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PolishNotationParser.ExpressionContext ctx);
}