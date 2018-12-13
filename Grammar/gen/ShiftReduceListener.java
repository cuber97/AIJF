// Generated from /home/dev/Pobrane/drive-download-20181210T212045Z-001/Grammar.IntelliJIdea/Grammar/ShiftReduce.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShiftReduceParser}.
 */
public interface ShiftReduceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShiftReduceParser#exprAlg}.
	 * @param ctx the parse tree
	 */
	void enterExprAlg(ShiftReduceParser.ExprAlgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftReduceParser#exprAlg}.
	 * @param ctx the parse tree
	 */
	void exitExprAlg(ShiftReduceParser.ExprAlgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShiftReduceParser#exprRev}.
	 * @param ctx the parse tree
	 */
	void enterExprRev(ShiftReduceParser.ExprRevContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftReduceParser#exprRev}.
	 * @param ctx the parse tree
	 */
	void exitExprRev(ShiftReduceParser.ExprRevContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShiftReduceParser#rootAlg}.
	 * @param ctx the parse tree
	 */
	void enterRootAlg(ShiftReduceParser.RootAlgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftReduceParser#rootAlg}.
	 * @param ctx the parse tree
	 */
	void exitRootAlg(ShiftReduceParser.RootAlgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShiftReduceParser#rootRev}.
	 * @param ctx the parse tree
	 */
	void enterRootRev(ShiftReduceParser.RootRevContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftReduceParser#rootRev}.
	 * @param ctx the parse tree
	 */
	void exitRootRev(ShiftReduceParser.RootRevContext ctx);
}