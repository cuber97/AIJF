import containers.ExpressionContainer;

public final class TreeEvaluationVisitor extends Jfk1BaseVisitor<ExpressionContainer> {

    @Override public ExpressionContainer visitNumber(Jfk1Parser.NumberContext ctx) {
        try {
        double number = Main.parse(ctx.getText());
        return new ExpressionContainer(number);
    } catch (java.text.ParseException e) {
        throw new IllegalArgumentException();
    } }

    @Override public ExpressionContainer visitListT(Jfk1Parser.ListTContext ctx) {
        ExpressionContainer childItems = new ExpressionContainer();
        Double childNumber;
        for(int i = 1 ; i < ctx.getChildCount() ; i+=2){
            childNumber = visit(ctx.getChild(i)).removeElement();
            childItems.addNumber(childNumber);
        }
        if(childItems.getcType() == ExpressionContainer.Type.Number)
        childItems.changeContainerType(ExpressionContainer.Type.List);
        return childItems;
    }

    @Override public ExpressionContainer visitOperationsReturningNumber(Jfk1Parser.OperationsReturningNumberContext ctx) {
        if (ctx.getChildCount() == 0) return new ExpressionContainer();
        ExpressionContainer par1 = visit(ctx.getChild(2));
        ExpressionContainer par2 = new ExpressionContainer();

        try {
            par2 = visit(ctx.getChild(4));
        } catch (NullPointerException e) {
        }
        ;

        // if(par2.getcType() == ExpressionContainer.Type.Number)

        if (ctx.op1ArgList != null) {
            switch (ctx.op1ArgList.getType()) {
                case Jfk1Parser.Max: {
                    Jfk1OpImpl.max(par1);
                    System.out.print("Max = ");
                    break;
                }
                case Jfk1Parser.Min: {
                    Jfk1OpImpl.min(par1);
                    System.out.print("Min = ");
                    break;
                }
                case Jfk1Parser.First: {
                    Jfk1OpImpl.first(par1);
                    System.out.print("First = ");
                    break;
                }
                case Jfk1Parser.Last: {
                    Jfk1OpImpl.last(par1);
                    System.out.print("Last = ");
                    break;
                }
                case Jfk1Parser.Length: {
                    Jfk1OpImpl.length(par1);
                    System.out.print("Length = ");
                    break;
                }
                case Jfk1Parser.Total: {
                    Jfk1OpImpl.total(par1);
                    System.out.println("Total = ");
                    break;
                }
            }
        }

        if (ctx.op2ArgListNumber != null) {
            switch (ctx.op2ArgListNumber.getType()) {
                case Jfk1Parser.Count: {
                    Jfk1OpImpl.count(par1, par2.removeElement());
                    System.out.print("Count = ");
                    break;
                }
                case Jfk1Parser.Position: {
                    Jfk1OpImpl.position(par1, par2.removeElement());
                    System.out.print("Position = ");
                    break;
                }
            }
        }
    System.out.println(par1.toStringNumber());
    return par1;
}
    @Override public ExpressionContainer visitOperationsReturningList(Jfk1Parser.OperationsReturningListContext ctx) {
        if(ctx.getChildCount() == 0) return new ExpressionContainer();
        ExpressionContainer par1 = visit(ctx.getChild(2));
        ExpressionContainer par2 = new ExpressionContainer();

        try{par2 = visit(ctx.getChild(4));
        }catch (NullPointerException e){};

        if(ctx.op1ArgList != null) {
            switch (ctx.op1ArgList.getType()) {
                case Jfk1Parser.Reverse: {
                    Jfk1OpImpl.reverse(par1);
                    System.out.print("Reverse = ");
                    break;
                }
                case Jfk1Parser.Sort: {
                    Jfk1OpImpl.sort(par1);
                    System.out.print("Sort = ");
                    break;
                }
                case Jfk1Parser.List: {
                    Jfk1OpImpl.list(par1);
                    System.out.print("List = ");
                    break;
                }
            }
        }
        if(ctx.op2ArgListList != null) {
            switch (ctx.op2ArgListList.getType()) {
                case Jfk1Parser.Join: {
                    Jfk1OpImpl.join(par1, par2);
                    System.out.print("Join = ");
                    break;
                }
                case Jfk1Parser.Add: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    Jfk1OpImpl.add(par1, par2);
                    System.out.print("Add = ");
                    break;
                }
                case Jfk1Parser.Substract: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    Jfk1OpImpl.substract(par1, par2);
                    System.out.print("Substract = ");
                    break;
                }
                case Jfk1Parser.Multiply: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    Jfk1OpImpl.multiply(par1, par2);
                    System.out.print("Multiply = ");
                    break;
                }
            }
        }
        if(ctx.op2ArgListNumber != null) {
            switch (ctx.op2ArgListNumber.getType()) {
                case Jfk1Parser.Take: {
                    Jfk1OpImpl.take(par1, par2.removeElement());
                    System.out.print("Take = ");
                    break;
                }
                case Jfk1Parser.Drop: {
                    Jfk1OpImpl.drop(par1, par2.removeElement());
                    System.out.print("Drop = ");
                    break;
                }
                case Jfk1Parser.Power: {
                    Jfk1OpImpl.power(par1, par2.removeElement());
                    System.out.print("Power = ");
                    break;
                }
                case Jfk1Parser.Add: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    Jfk1OpImpl.add(par1, par2.removeElement());
                    System.out.print("Add = ");
                    break;
                }
                case Jfk1Parser.Substract: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    Jfk1OpImpl.substract(par1, par2.removeElement());
                    System.out.print("Substract = ");
                    break;
                }
                case Jfk1Parser.Multiply: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    Jfk1OpImpl.multiply(par1, par2.removeElement());
                    System.out.print("Multiply = ");
                    break;
                }
            }
        }
        System.out.println(par1.toStringList());
        return par1;

    }

    @Override public ExpressionContainer visitExpression(Jfk1Parser.ExpressionContext ctx) {
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
