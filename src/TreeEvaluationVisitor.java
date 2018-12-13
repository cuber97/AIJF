import containers.ExpressionContainer;

import java.util.Collections;

public final class TreeEvaluationVisitor extends jfk1BaseVisitor<ExpressionContainer> {
    /*
    @Override
    public Double visitNumber(PolishNotationParser.NumberContext ctx) throws IllegalArgumentException {
        try {
            return Main.parse(ctx.getText());
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException();
        }
    }*/


    @Override public ExpressionContainer visitNumber(jfk1Parser.NumberContext ctx) {
        //System.out.println("TEST NUMBER = " + ctx.getText());
        try {
        return new ExpressionContainer(Main.parse(ctx.getText()));
    } catch (java.text.ParseException e) {
        throw new IllegalArgumentException();
    } }

    @Override public ExpressionContainer visitListBase(jfk1Parser.ListBaseContext ctx) {
        ExpressionContainer childItems = new ExpressionContainer();
        for(int i = 1 ; i < ctx.getChildCount() ; i+=2){
            childItems.getItemContainer().add(visit(ctx.getChild(i)).getFirstListValue());
        }

        return childItems;
    }

    @Override public ExpressionContainer visitListT(jfk1Parser.ListTContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override public ExpressionContainer visitOperationsReturningNumber(jfk1Parser.OperationsReturningNumberContext ctx) {

        ExpressionContainer childList = visit(ctx.getChild(2));

        switch(ctx.op1ArgList.getType()){
            case jfk1Parser.Max:{
                double max = Collections.max(childList.getItemContainer());
                childList.clearContainer();
                childList.addNumber(max);
                System.out.println("Max = " + max);
                break;
            }
            case jfk1Parser.Min:{
                double min = Collections.min(childList.getItemContainer());
                childList.clearContainer();
                childList.addNumber(min);
                System.out.println("Min = " + min);
                break;
            }
        }

    return childList;

}

    @Override public ExpressionContainer visitExtendedExpressionsReturningNumber(jfk1Parser.ExtendedExpressionsReturningNumberContext ctx) {
            ExpressionContainer childItems = new ExpressionContainer();
            //System.out.println("test " + ctx.getChild(0).getText());
            for (int i = 0; i < ctx.getChildCount(); i += 2) {
                childItems.addNumber(visit(ctx.getChild(i)).getFirstListValue());
            }
            //System.out.println("TEST" + childItems.removeFirstListElement()+ " " + childItems.removeFirstListElement());
            //System.out.println("Lista " + childItems.getItemContainer().toString());


            double opVal = childItems.removeFirstListElement();
            for (int i = 1; i < ctx.getChildCount(); i += 2) {
                switch (ctx.getChild(i).getText()) {
                    case "+": {
                        opVal += childItems.removeFirstListElement();
                        System.out.println(opVal);
                    }
                }
            }
            System.out.println("Suma = " + opVal);
            return childItems;

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
