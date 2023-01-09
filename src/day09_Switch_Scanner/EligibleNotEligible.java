package day09_Switch_Scanner;

import java.util.Scanner;

public class EligibleNotEligible {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println( "Enter your age:");
         byte age = input.nextByte();
         String result = "";

         if (age>0 && age<120){
        result= (age>=21)? "eligible": "not eligible";
         }
        System.out.println(result);
        input.close();


    }





}
