import containers.ExpressionContainer;

public final class TreeEvaluationVisitor extends jfk1BaseVisitor<ExpressionContainer> {

    @Override public ExpressionContainer visitNumber(jfk1Parser.NumberContext ctx) {
        System.out.print(ctx.getText());
        try {
        double number = Main.parse(ctx.getText());
        return new ExpressionContainer(number);
    } catch (java.text.ParseException e) {
        throw new IllegalArgumentException();
    } }

    @Override public ExpressionContainer visitListT(jfk1Parser.ListTContext ctx) {
        ExpressionContainer childItems = new ExpressionContainer();
        Double childNumber;
        for(int i = 1 ; i < ctx.getChildCount() ; i+=2){
            childNumber = visit(ctx.getChild(i)).removeElement();
            childItems.addNumber(childNumber);
        }
        return childItems;
    }

    @Override public ExpressionContainer visitOperationsReturningNumber(jfk1Parser.OperationsReturningNumberContext ctx) {
        if(ctx.getChildCount() == 0) return new ExpressionContainer();
        ExpressionContainer par1 = visit(ctx.getChild(2));
        ExpressionContainer par2 = new ExpressionContainer();

        try{par2 = visit(ctx.getChild(4));
        }catch (NullPointerException e){};

        if(ctx.op1ArgList != null){
        switch(ctx.op1ArgList.getType()) {
            case jfk1Parser.Max: {
                jfk1OpImpl.max(par1);
                System.out.print("Max = ");
                break;
            }
            case jfk1Parser.Min: {
                jfk1OpImpl.min(par1);
                System.out.print("Min = ");
                break;
            }
        }
        }
    System.out.println(par1.toStringNumber());
    return par1;
}
    @Override public ExpressionContainer visitOperationsReturningList(jfk1Parser.OperationsReturningListContext ctx) {
        if(ctx.getChildCount() == 0) return new ExpressionContainer();
        ExpressionContainer par1 = visit(ctx.getChild(2));
        ExpressionContainer par2 = new ExpressionContainer();

        try{par2 = visit(ctx.getChild(4));
        }catch (NullPointerException e){};

        if(ctx.op1ArgList != null) {
            switch (ctx.op1ArgList.getType()) {
                case jfk1Parser.Reverse: {
                    jfk1OpImpl.reverse(par1);
                    System.out.print("Reverse = ");
                    break;
                }
            }
        }if(ctx.op2ArgListList != null) {
            switch (ctx.op2ArgListList.getType()) {
                case jfk1Parser.Join: {
                    jfk1OpImpl.join(par1, par2);
                    System.out.print("Join = ");
                }
            }
        }
        System.out.println(par1.toStringList());
        return par1;

    }

    @Override public ExpressionContainer visitExpression(jfk1Parser.ExpressionContext ctx) {
        ExpressionContainer childList = visit(ctx.getChild(0));

        System.out.print("Expression result = ");
        switch(childList.getcType()){
            case Number: {System.out.println(childList.toStringNumber()); break;}
            case List: {System.out.println(childList.toStringList()); break;}
            case Empty: {System.out.println("Expression returned empty!"); break;}
        }

        System.out.println("End of Expression...");
        return childList;
    }

}
