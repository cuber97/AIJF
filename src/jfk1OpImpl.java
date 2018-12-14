import containers.ExpressionContainer;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jfk1OpImpl {


    //OPERATIONS RETURNING Number
    //1)Arg <List>
    public static void max(ExpressionContainer par1){

        double max = Collections.max(par1.getItemContainer());
        par1.clearContainer();
        par1.addNumber(max);
        par1.changeContainerType(ExpressionContainer.Type.Number);
        return ;

    }
    public static void min(ExpressionContainer par1){

        double min = Collections.min(par1.getItemContainer());
        par1.clearContainer();
        par1.addNumber(min);
        par1.changeContainerType(ExpressionContainer.Type.Number);
        return ;
    }
    //2)Arg <List,List>

    //3)Arg <List,Number>

    //OPERATIONS RETURNING LIST
    //1)Arg <List>
    public static void reverse(ExpressionContainer par1){
        Collections.reverse(par1.getItemContainer());
        return;
    }
    //2)Arg <List,List>
    public static void join(ExpressionContainer par1, ExpressionContainer par2){
        par1.getItemContainer().addAll(par2.getItemContainer());
        return;
    }
    //3)Arg <List,Number>
}
