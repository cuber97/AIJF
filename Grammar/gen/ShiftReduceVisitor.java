// Generated from /home/dev/Pobrane/drive-download-20181210T212045Z-001/Grammar.IntelliJIdea/Grammar/ShiftReduce.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShiftReduceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShiftReduceVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShiftReduceParser#exprAlg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAlg(ShiftReduceParser.ExprAlgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShiftReduceParser#exprRev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRev(ShiftReduceParser.ExprRevContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShiftReduceParser#rootAlg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootAlg(ShiftReduceParser.RootAlgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShiftReduceParser#rootRev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootRev(ShiftReduceParser.RootRevContext ctx);
}