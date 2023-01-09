package day14_MethodOverloading;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <10 ; i++) {
            System.out.println("Enter a number:"); // this process will run in the loop 10 times
            int num = input.nextInt(); // and will ask the user for input 10 times
        }

int sum = 0;
        for(int i=0;i<10;i++){
            System.out.println("Enter a number");
            sum +=input.nextInt();
        }
        System.out.println(sum);

// write a program that can ask to enter a number for 5 times, print the maximum number




        }



}



