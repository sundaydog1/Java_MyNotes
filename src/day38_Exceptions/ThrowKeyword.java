package day38_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Enter your age:");

        int age = new Scanner(System.in).nextInt();

if(age<0||age>150){
    throw new InputMismatchException("Age of the person should not be negative or greater than 150");

}
if(age>=21){
    System.out.println("Eligible");
}else{
    System.out.println("Not eligible");
}
        System.out.println("------------------------------------------------");

RuntimeException exception = new RuntimeException();

throw exception; // exception is the reference to the RuntimeException object


    }
}
