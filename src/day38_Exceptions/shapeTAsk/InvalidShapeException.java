package day38_Exceptions.shapeTAsk;

public class InvalidShapeException extends RuntimeException{
    public InvalidShapeException(String message){
        super(message);
    }
}
