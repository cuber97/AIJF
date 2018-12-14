package containers.ContainerException;

public class WrongTypeException extends RuntimeException {
    public WrongTypeException(String exceptionText){System.out.println("WrongTypeExpression :" + exceptionText);};
}
