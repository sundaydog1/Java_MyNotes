package day37_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");

        try {
            System.out.println(9 / 0); //Arithmetic exception
            System.out.println("Try block");

        }catch (ArithmeticException e){
            System.out.println("Catch block"); // catch block will be executed
        }


        System.out.println("Test ended");
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {

            System.out.println(str.toLowerCase());
            System.out.println("Try Block");

        }catch (RuntimeException e){ // if don't know a particular exceprion class,
                                    // we can always use Runtime Exception for unchecked exceptions
            System.out.println("Catch Block"); // catch block will be executed
        }


        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program3 started");

        try {

            Thread.sleep(5000);
            System.out.println("Try Block"); // try block will get executed

        }catch (InterruptedException e){

            System.out.println("Catch Block");

        }

        System.out.println("Program3 ended");



    }
}
