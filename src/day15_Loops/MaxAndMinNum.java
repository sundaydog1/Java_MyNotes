package day15_Loops;

import java.util.Scanner;

public class MaxAndMinNum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int max = -2147483648;// any integer number that user enters will always be greater than -2147483648
        int min = 2147483647;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num>max){   //we need to have two separate conditions! we can't do If_else.
                max=num; // because if its not the maximum we can't automatically assume it's
            }           // the minimum number

            if (num<min){
                min = num;
            }
        }
        System.out.println("Maximim number is: "+max);
        System.out.println("Minimum number is: "+min);








    }











}
