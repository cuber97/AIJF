import containers.ExpressionContainer;

import java.util.*;
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

    public static void first(ExpressionContainer par1){
        double first = par1.getItemContainer().getFirst();

        par1.clearContainer();
        par1.addNumber(first);
        par1.changeContainerType(ExpressionContainer.Type.Number);
    }

    public static void last(ExpressionContainer par1){
        double last = par1.getItemContainer().getLast();

        par1.clearContainer();
        par1.addNumber(last);
        par1.changeContainerType(ExpressionContainer.Type.Number);
    }

    public static void length(ExpressionContainer par1){
        double length = par1.getItemContainer().size();

        par1.clearContainer();
        par1.addNumber(length);
        par1.changeContainerType(ExpressionContainer.Type.Number);
    }

    public static void total(ExpressionContainer par1){
        double total = 0;

        for(double element : par1.getItemContainer()){
            total += element;
        }

        par1.clearContainer();
        par1.addNumber(total);
        par1.changeContainerType(ExpressionContainer.Type.Number);
    }

    //2)Arg <List,List>


    //3)Arg <List,Number>
    public static void count(ExpressionContainer par1, double par2){
        double count = 0;

        for(double element : par1.getItemContainer()){
            if(element==par2) count++;
        }

        par1.clearContainer();
        par1.addNumber(count);
        par1.changeContainerType(ExpressionContainer.Type.Number);
    }

    public static void position(ExpressionContainer par1, double par2){
        double position = 1;

        for(double element : par1.getItemContainer()){
            if(element == par2) break;
            position++;
        }

        if(position > par1.getContainerLength()) {
            position = 0;
            System.out.println("Brak podanego elementu w liście, zwrócono wartość 0");
        }

        par1.clearContainer();
        par1.addNumber(position);
        par1.changeContainerType(ExpressionContainer.Type.Number);
    }

    //OPERATIONS RETURNING LIST
    //1)Arg <List>
    public static void reverse(ExpressionContainer par1){
        Collections.reverse(par1.getItemContainer());
        return;
    }

    public static void list(ExpressionContainer par1){
        //NOP
    }

    public static void integerDigits(ExpressionContainer par1){
        //NOP//to powinno przyjmwoac double
    }

    public static void sort(ExpressionContainer par1){
        Collections.sort(par1.getItemContainer());
        return;
    }

    //2)Arg <List,List>
    public static void join(ExpressionContainer par1, ExpressionContainer par2){
        par1.getItemContainer().addAll(par2.getItemContainer());
        return;
    }

    public static void add(ExpressionContainer par1, ExpressionContainer par2) {
        for(int i = 0; i < par1.getItemContainer().size() && i < par2.getItemContainer().size(); ++i) {
            double tmp = par1.getItemContainer().get(i) + par2.getItemContainer().get(i);
            par1.getItemContainer().set(i, tmp);
        }
    }

    public static void substract(ExpressionContainer par1, ExpressionContainer par2) {
        for(int i = 0; i < par1.getItemContainer().size() && i < par2.getItemContainer().size(); ++i) {
            double tmp = par1.getItemContainer().get(i) - par2.getItemContainer().get(i);
            par1.getItemContainer().set(i, tmp);
        }
    }

    public static void multiply(ExpressionContainer par1, ExpressionContainer par2) {
        for(int i = 0; i < par1.getItemContainer().size() && i < par2.getItemContainer().size(); ++i) {
            double tmp = par1.getItemContainer().get(i) * par2.getItemContainer().get(i);
            par1.getItemContainer().set(i, tmp);
        }
    }

    //3)Arg <List,Number>

    public static void add(ExpressionContainer par1, double par2) {
        for(int i = 0; i < par1.getItemContainer().size(); ++i) {
            par1.getItemContainer().set(i, par1.getItemContainer().get(i) + par2);
        }
    }

    public static void substract(ExpressionContainer par1, double par2) {
        for(int i = 0; i < par1.getItemContainer().size(); ++i) {
            par1.getItemContainer().set(i, par1.getItemContainer().get(i) - par2);
        }
    }

    public static void multiply(ExpressionContainer par1, double par2) {
        for(int i = 0; i < par1.getItemContainer().size(); ++i) {
            par1.getItemContainer().set(i, par1.getItemContainer().get(i) * par2);
        }
    }

    public static void power(ExpressionContainer par1, double par2) {
        for(int i = 0; i < par1.getItemContainer().size(); ++i) {
            par1.getItemContainer().set(i, Math.pow(par1.getItemContainer().get(i), par2));
        }
    }

    public static void take(ExpressionContainer par1, double par2) {
        int size = par1.getItemContainer().size();

        for(int i = (int)par2; i < size; ++i) {
            par1.getItemContainer().remove((int)par2);
        }
    }

    public static void drop(ExpressionContainer par1, double par2) {

        if(par2 > par1.getContainerLength()) {
            par1.clearContainer();
            return;
        }
        for(int i = 0; i < par2; ++i) {
            par1.getItemContainer().remove(0);
        }
    }
}
