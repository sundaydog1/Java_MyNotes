package day15_Loops;

import java.util.Scanner;

public class WhileLoop_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        while ( !(age>=1 && age<=150)) { // while the age is INVALID
            System.out.println("Invalid entry! Please re-enter your age:");
            age = input.nextInt();

        }

        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }



input.close();







    }










}
