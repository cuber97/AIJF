package containers;

import containers.ContainerException.WrongTypeException;

import java.util.LinkedList;
import java.util.List;


public class ExpressionContainer {

    //Container
    private LinkedList<Double> itemContainer = new LinkedList<>();
    //Container type
    private Type cType;

    public enum Type {
        Empty ,Number, List;
    }

    //Constructors
    public ExpressionContainer(){cType = Type.Empty;} //no initiation param
    public ExpressionContainer(LinkedList linkedList){
        this.itemContainer = linkedList;
        cType = Type.List;
    } //initiation param as list
    public ExpressionContainer(Double number){
        this.itemContainer.add(number);
        cType = Type.Number;
    } //initiation param as number

    public int getContainerLength(){
        return this.itemContainer.size();
    }

    //(for internal purpose)
    private Type findNewContainerType(){
        int cLen = this.getContainerLength();
        if(cLen > 1) return Type.List;
        else if(cLen == 1) return Type.Number;
        return Type.Empty;
    }

    //Auto Change Type
    public void changeContainerType(){
        this.cType = findNewContainerType();
    }

    //Set new Change Type
    public void changeContainerType(Type newType){
        this.cType = newType;
    }

    //Call exception of wrong type
    private void callExceptionIfWrongType(String exceptionText, Type type) throws WrongTypeException{
        if(getcType() != type)
            throw new WrongTypeException(exceptionText);
    }

    //Clear list/number method
    public void clearContainer(){
        this.itemContainer.clear();
    }

    //Add methods
    public void addNumber(Double number){
            this.getItemContainer().add(number);
            changeContainerType();
    }
    public void addList(LinkedList<Double> linkedList){
        this.setItemContainer(linkedList);
    }

    //Remove methods
    //Number
    public Double removeElement() {
         return this.itemContainer.remove(0);
    }

    //toString Methods
    //Number
    public String toStringNumber() { //return String representation of Number
        String exceptionText =  "toStringNumber() called on wrong container Type! ["
                + this.getcType()+"] ";
        callExceptionIfWrongType(exceptionText,Type.Number);
        return this.getItemContainer().get(0).toString();
    }
    //List
    public String toStringList() { //return String representation of List
        String exceptionText =  "toStringList() called on wrong container Type! ["
                + this.getcType()+"] ";
        callExceptionIfWrongType(exceptionText,Type.List);
        return this.getItemContainer().toString();
    }


    //Standard getters/setters

    public LinkedList<Double> getItemContainer() {
        return itemContainer;
    }

    public void setItemContainer(LinkedList<Double> itemContainer) {
        this.itemContainer = itemContainer;
    }

    public Type getcType() {
        return cType;
    }

    public void setcType(Type cType) {
        this.cType = cType;
    }

}
