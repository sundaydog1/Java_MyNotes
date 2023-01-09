package day15_Loops;
/*
Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */
import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
int max = -2147483648; // this is the smallest integar number in Java
        for (int i = 0; i < 5; i++) { // i =0,1,2,3,4 ==> entry will happen 5 times
            System.out.println("Enter a number:");
            int num = input.nextInt(); //10,5,3,20,15
            if( num>max){
                max = num; // if the user entered number is greater that the current maximum number
                // that we have,then it will be assigned to maximum number. every next entry will
                //be compared to the previous one
            }
        }

        System.out.println("Maximum number is: "+max);








    }




















}
