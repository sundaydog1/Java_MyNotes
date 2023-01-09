package day38_Exceptions;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException() {
        super("It's break time!");
    }

    public BreakTimeException(String message){
        super(message);
    }
}
