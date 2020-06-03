import containers.ExpressionContainer;

public final class TreeEvaluationVisitor extends AijfBaseVisitor<ExpressionContainer> {

    @Override public ExpressionContainer visitNumber(AijfParser.NumberContext ctx) {
        try {
        double number = Main.parse(ctx.getText());
        return new ExpressionContainer(number);
    } catch (java.text.ParseException e) {
        throw new IllegalArgumentException();
    } }

    @Override public ExpressionContainer visitListT(AijfParser.ListTContext ctx) {
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

    @Override public ExpressionContainer visitOperationsReturningNumber(AijfParser.OperationsReturningNumberContext ctx) {
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
                case AijfParser.Max: {
                    AijfOpImpl.max(par1);
                    System.out.print("Max = ");
                    break;
                }
                case AijfParser.Min: {
                    AijfOpImpl.min(par1);
                    System.out.print("Min = ");
                    break;
                }
                case AijfParser.First: {
                    AijfOpImpl.first(par1);
                    System.out.print("First = ");
                    break;
                }
                case AijfParser.Last: {
                    AijfOpImpl.last(par1);
                    System.out.print("Last = ");
                    break;
                }
                case AijfParser.Length: {
                    AijfOpImpl.length(par1);
                    System.out.print("Length = ");
                    break;
                }
                case AijfParser.Total: {
                    AijfOpImpl.total(par1);
                    System.out.println("Total = ");
                    break;
                }
            }
        }

        if (ctx.op2ArgListNumber != null) {
            switch (ctx.op2ArgListNumber.getType()) {
                case AijfParser.Count: {
                    AijfOpImpl.count(par1, par2.removeElement());
                    System.out.print("Count = ");
                    break;
                }
                case AijfParser.Position: {
                    AijfOpImpl.position(par1, par2.removeElement());
                    System.out.print("Position = ");
                    break;
                }
            }
        }
    System.out.println(par1.toStringNumber());
    return par1;
}
    @Override public ExpressionContainer visitOperationsReturningList(AijfParser.OperationsReturningListContext ctx) {
        if(ctx.getChildCount() == 0) return new ExpressionContainer();
        ExpressionContainer par1 = visit(ctx.getChild(2));
        ExpressionContainer par2 = new ExpressionContainer();

        try{par2 = visit(ctx.getChild(4));
        }catch (NullPointerException e){};

        if(ctx.op1ArgList != null) {
            switch (ctx.op1ArgList.getType()) {
                case AijfParser.Reverse: {
                    AijfOpImpl.reverse(par1);
                    System.out.print("Reverse = ");
                    break;
                }
                case AijfParser.Sort: {
                    AijfOpImpl.sort(par1);
                    System.out.print("Sort = ");
                    break;
                }
                case AijfParser.RemoveDuplicates: {
                    AijfOpImpl.removeDuplicates(par1);
                    System.out.print("Remove = ");
                    break;
                }
                case AijfParser.List: {
                    AijfOpImpl.list(par1);
                    System.out.print("List = ");
                    break;
                }
            }
        }
        if(ctx.op2ArgListList != null) {
            switch (ctx.op2ArgListList.getType()) {
                case AijfParser.Join: {
                    AijfOpImpl.join(par1, par2);
                    System.out.print("Join = ");
                    break;
                }
                case AijfParser.Intersection: {
                    AijfOpImpl.intersection(par1, par2);
                    System.out.print("Intersection = ");
                    break;
                }
                case AijfParser.Add: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    AijfOpImpl.add(par1, par2);
                    System.out.print("Add = ");
                    break;
                }
                case AijfParser.Substract: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    AijfOpImpl.substract(par1, par2);
                    System.out.print("Substract = ");
                    break;
                }
                case AijfParser.Multiply: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    AijfOpImpl.multiply(par1, par2);
                    System.out.print("Multiply = ");
                    break;
                }
            }
        }
        if(ctx.op2ArgListNumber != null) {
            switch (ctx.op2ArgListNumber.getType()) {
                case AijfParser.Take: {
                    AijfOpImpl.take(par1, par2.removeElement());
                    System.out.print("Take = ");
                    break;
                }
                case AijfParser.Drop: {
                    AijfOpImpl.drop(par1, par2.removeElement());
                    System.out.print("Drop = ");
                    break;
                }
                case AijfParser.Power: {
                    AijfOpImpl.power(par1, par2.removeElement());
                    System.out.print("Power = ");
                    break;
                }
                case AijfParser.Add: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    AijfOpImpl.add(par1, par2.removeElement());
                    System.out.print("Add = ");
                    break;
                }
                case AijfParser.Substract: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    AijfOpImpl.substract(par1, par2.removeElement());
                    System.out.print("Substract = ");
                    break;
                }
                case AijfParser.Multiply: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    AijfOpImpl.multiply(par1, par2.removeElement());
                    System.out.print("Multiply = ");
                    break;
                }
            }
        }
        System.out.println(par1.toStringList());
        return par1;

    }

    @Override public ExpressionContainer visitExpression(AijfParser.ExpressionContext ctx) {
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
