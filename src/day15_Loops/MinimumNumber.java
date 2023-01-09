package day15_Loops;
/*
Write a program that can ask the user to enter a number for 5 times and returns the minimum number
 */
import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        int min = 2147483647; // the maximum possible integer number

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter your number:");

           int num = input.nextInt();
            if (num<min){ // if the number entered is less than the current minimum number
                min = num; // it will replace the existing minimum number
            }
            System.out.println("Minimum number:"+min);
        }








    }






}
