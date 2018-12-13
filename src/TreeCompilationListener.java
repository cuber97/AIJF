import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.text.ParseException;
import java.util.List;

public final class TreeCompilationListener extends jfk1BaseListener {
   private final MethodVisitor _mv;
    private int _currentTreeDepth, _maxTreeDepth;

    public int getTreeDepth(){
        return this._maxTreeDepth;
    }

    public TreeCompilationListener(MethodVisitor mv) {
        this._mv = mv;
    }
/*
    @Override public void enterNumber(jfk1Parser.NumberContext ctx) {
        this._currentTreeDepth++;
        if (this._currentTreeDepth > this._maxTreeDepth)
            this._maxTreeDepth = this._currentTreeDepth;

        try {
            this._mv.visitLdcInsn(Main.parse(ctx.getText()));
        } catch (ParseException e) {
            throw new IllegalArgumentException("Number is not of the double type.");
        }
    }

    @Override public void enterListT(jfk1Parser.ListTContext ctx) {
        this._currentTreeDepth++;
        if (this._currentTreeDepth > this._maxTreeDepth)
            this._maxTreeDepth = this._currentTreeDepth;

        try {
            this._mv.visitLdcInsn(Main.parse(ctx.getText()));
        } catch (ParseException e) {
            throw new IllegalArgumentException("containers.ExpressionContainer is not of the containers.ExpressionContainer type.");
        }
    }


    @Override
    public void enterExpression(jfk1Parser.ExpressionContext ctx) {
        this._currentTreeDepth = 0;
        this._maxTreeDepth = 0;
    }

    @Override public void exitExpression(jfk1Parser.ExpressionContext ctx) {

        List<jfk1Parser.BasicExpressionsReturningListContext> ctxList = ctx.extendedExpressionsReturningList().basicExpressionsReturningList();
        List<jfk1Parser.BasicExpressionsReturningNumberContext> ctxNumber = ctx.extendedExpressionsReturningNumber().basicExpressionsReturningNumber();
        if(null == ctxList || null == ctxNumber){
            return;
        }

        switch(((Token) ctxList).getType()){
            case jfk1Parser.Reverse:
                this._mv.visitInsn(Opcodes.INVOKESTATIC,"containers/ExpressionContainer", "reverse", "()");


        }

    }

    @Override public void exitOperationsReturningList(jfk1Parser.OperationsReturningListContext ctx) {

        ctx.

        if(null == ctx.op1ArgList || null == ctx.op2ArgListList || null == ctx.op2ArgListNumber)
    }

    @Override
    public void (PolishNotationParser.OperationContext ctx) {
        if (null == ctx.op) // '(' operation ')'
            return;
        switch(ctx.op.getType()) {
            case PolishNotationParser.Multiply:
                this._mv.visitInsn(Opcodes.DMUL);
                break;
            case PolishNotationParser.Divide:
                this._mv.visitInsn(Opcodes.DDIV);
                break;
            case PolishNotationParser.Add:
                this._mv.visitInsn(Opcodes.DADD);
                break;
            case PolishNotationParser.Subtract:
                this._mv.visitInsn(Opcodes.DSUB);
                break;
            case PolishNotationParser.Power:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "pow", "(DD)D", false);
                break;
            case PolishNotationParser.Max:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "max", "(DD)D", false);
                break;
            case PolishNotationParser.Min:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "min", "(DD)D", false);
                break;
            default:
                throw new IllegalArgumentException();
        }
        this._currentTreeDepth--;
    }*/
}
