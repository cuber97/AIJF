package containers;

import org.antlr.v4.codegen.model.ExceptionClause;

import java.util.LinkedList;
import java.util.List;

public class ExpressionContainer {

    private List<Double> itemContainer = new LinkedList<>();

    public ExpressionContainer(List list){
        this.itemContainer = list;
    }

    public ExpressionContainer(Double number){
        this.itemContainer.add(number);
    }

    public ExpressionContainer(){
    }

    public void addNumber(Double number){
        this.itemContainer.add(number);
    }

    public void clearContainer(){
        this.itemContainer.clear();
    }

    public Double getFirstListValue(){
            return this.itemContainer.get(0);
    }

    public Double removeFirstListElement() {
        return this.itemContainer.remove(0);
    }


    public int getContainerLength(){
        return this.itemContainer.size();
    }

    public String getContainerType(){
        if(this.getContainerLength() == 1)
            return "Number";
        else if(this.getContainerLength() > 0) return "List";
        else return "Empty";
    }



    public List reverse(List<Double> listT){
        System.out.println("Call on method reverse");
        return listT;
    }


    public List<Double> getItemContainer() {
        return itemContainer;
    }

    public void setItemContainer(List<Double> itemContainer) {
        this.itemContainer = itemContainer;
    }
}
