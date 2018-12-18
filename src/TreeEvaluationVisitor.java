import containers.ExpressionContainer;

public final class TreeEvaluationVisitor extends jfk1BaseVisitor<ExpressionContainer> {

    @Override public ExpressionContainer visitNumber(jfk1Parser.NumberContext ctx) {
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
                case jfk1Parser.First: {
                    jfk1OpImpl.first(par1);
                    System.out.print("First = ");
                    break;
                }
                case jfk1Parser.Last: {
                    jfk1OpImpl.last(par1);
                    System.out.print("Last = ");
                    break;
                }
                case jfk1Parser.Length: {
                    jfk1OpImpl.length(par1);
                    System.out.print("Length = ");
                    break;
                }
                case jfk1Parser.Total: {
                    jfk1OpImpl.total(par1);
                    System.out.println("Total = ");
                    break;
                }
            }
        }

        if (ctx.op2ArgListNumber != null) {
            switch (ctx.op2ArgListNumber.getType()) {
                case jfk1Parser.Count: {
                    jfk1OpImpl.count(par1, par2.removeElement());
                    System.out.print("Count = ");
                    break;
                }
                case jfk1Parser.Position: {
                    jfk1OpImpl.position(par1, par2.removeElement());
                    System.out.print("Position = ");
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
                case jfk1Parser.Sort: {
                    jfk1OpImpl.sort(par1);
                    System.out.print("Sort = ");
                    break;
                }
                case jfk1Parser.List: {
                    jfk1OpImpl.list(par1);
                    System.out.print("List = ");
                    break;
                }
            }
        }
        if(ctx.op2ArgListList != null) {
            switch (ctx.op2ArgListList.getType()) {
                case jfk1Parser.Join: {
                    jfk1OpImpl.join(par1, par2);
                    System.out.print("Join = ");
                    break;
                }
                case jfk1Parser.Add: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    jfk1OpImpl.add(par1, par2);
                    System.out.print("Add = ");
                    break;
                }
                case jfk1Parser.Substract: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    jfk1OpImpl.substract(par1, par2);
                    System.out.print("Substract = ");
                    break;
                }
                case jfk1Parser.Multiply: {
                    if(par2.getcType() == ExpressionContainer.Type.Number) {
                        break;
                    }
                    jfk1OpImpl.multiply(par1, par2);
                    System.out.print("Multiply = ");
                    break;
                }
            }
        }
        if(ctx.op2ArgListNumber != null) {
            switch (ctx.op2ArgListNumber.getType()) {
                case jfk1Parser.Take: {
                    jfk1OpImpl.take(par1, par2.removeElement());
                    System.out.print("Take = ");
                    break;
                }
                case jfk1Parser.Drop: {
                    jfk1OpImpl.drop(par1, par2.removeElement());
                    System.out.print("Drop = ");
                    break;
                }
                case jfk1Parser.Power: {
                    jfk1OpImpl.power(par1, par2.removeElement());
                    System.out.print("Power = ");
                    break;
                }
                case jfk1Parser.Add: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    jfk1OpImpl.add(par1, par2.removeElement());
                    System.out.print("Add = ");
                    break;
                }
                case jfk1Parser.Substract: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    jfk1OpImpl.substract(par1, par2.removeElement());
                    System.out.print("Substract = ");
                    break;
                }
                case jfk1Parser.Multiply: {
                    if(par2.getcType() == ExpressionContainer.Type.List) {
                        break;
                    }
                    jfk1OpImpl.multiply(par1, par2.removeElement());
                    System.out.print("Multiply = ");
                    break;
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
