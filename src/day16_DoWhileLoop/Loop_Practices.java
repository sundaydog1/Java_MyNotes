package day16_DoWhileLoop;

import java.util.Scanner;

public class Loop_Practices {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {  // the i that we declare in this loop will be only accessible in this loop and act like a local variable within this loop
            System.out.println("Hello"+i);
        }

        System.out.println("--------------------------------------------");

        // how to transform FOR loop into WHILE loop
        int j = 0;
        while (j<5){
            System.out.println("Hello"+j);
            j++;
        }

        System.out.println("-------------------------------");

        // how to convert FOR LOOP into WHILE DO loop
        int k =0;
        do {
            System.out.println("Hello"+k);
         k++ ;
        }while (k<5);

        System.out.println("----------------------");
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your score:");
        int score = input.nextInt();

        while (score<0|| score >100){ // while the score is invalid
            System.out.println("Invalid score, please re-enter your score"); // we will repeatedly ask the user to re-enter the score
            score = input.nextInt();// this loop will stop when the user provides us a valid score
        }


        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
