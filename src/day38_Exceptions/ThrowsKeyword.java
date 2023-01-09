package day38_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("--------------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");


        System.out.println("--------------------------------------");

        System.out.println("Program3 started");

        //FileInputStream file = new FileInputStream("");
        Thread.sleep(5000);

        System.out.println("Program3 ended");




    }
}
