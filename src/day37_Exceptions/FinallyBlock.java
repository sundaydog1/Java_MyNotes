package day37_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            System.out.println(9/0);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
     //       System.exit(1); // if we want to prevent finally block from execution
        }finally{
            System.out.println("Finally Block"); // will be executed regardless the exception handled or not
        }
    }
}