import containers.ListT;
import org.antlr.v4.runtime.Token;

import java.util.List;

public final class TreeEvaluationVisitor extends jfk1BaseVisitor<Double> {
    /*
    @Override
    public Double visitNumber(PolishNotationParser.NumberContext ctx) throws IllegalArgumentException {
        try {
            return Main.parse(ctx.getText());
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException();
        }
    }*/


    @Override public Double visitNumber(jfk1Parser.NumberContext ctx) {
        System.out.println("TEST NUMBER = " + ctx.getText());
        try {
        return Main.parse(ctx.getText());
    } catch (java.text.ParseException e) {
        throw new IllegalArgumentException();
    } }

    @Override public Double visitListT(jfk1Parser.ListTContext ctx) {


        System.out.println("TEST = " + ctx.getText());
        return visitChildren(ctx);
    }

    @Override public Double visitOperationsReturningNumber(jfk1Parser.OperationsReturningNumberContext ctx) {
        switch(ctx.op1ArgList.getType()){
            case jfk1Parser.Max:{
                System.out.println("operation = MAX!");
                break;
            }
            case jfk1Parser.Min:{
                System.out.println("operation = MIN!");
                break;
            }
        }



    return visitChildren(ctx);

}

    @Override public Double visitExtendedExpressionsReturningList(jfk1Parser.ExtendedExpressionsReturningListContext ctx) {
        //System.out.println("TEST Expression = " + ctx.getText());


        return visitChildren(ctx);
    }

    /*
    @Override
    public Double visitExpression(jfk1Parser.ExpressionContext ctx) {

        if (null == ctx.op) // '(' operation ')'
            return visit(ctx.operation(0));

        Function<Double, Double, Double> operand;
        switch(ctx.op.getType()) {
            case PolishNotationParser.Multiply:
                operand = (a, b) -> a * b;
                break;
            case PolishNotationParser.Divide:
                operand = (a, b) -> a / b;
                break;
            case PolishNotationParser.Add:
                operand = (a, b) -> a + b;
                break;
            case PolishNotationParser.Subtract:
                operand = (a, b) -> a - b;
                break;
            case PolishNotationParser.Power:
                operand = Math::pow;
                break;
            case PolishNotationParser.Max:
                operand = Math::max;
                break;
            case PolishNotationParser.Min:
                operand = Math::min;
                break;
            default:
                throw new IllegalArgumentException();
        }

        double left = visit(ctx.getChild(1));
        double right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }*/
}
