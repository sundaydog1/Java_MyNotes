package day09_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Would you like to continue?");
        String answer = input.next(); // returns only 1st word or a character
        System.out.println("You have entered:"+ answer);

        System.out.println("Enter a character:");
        char ch = input.next().charAt(0);  // the only way to declare Char in scanner
        System.out.println("You have entered:" +ch);


        String answer1 = input.nextLine(); // returns the whole input until the next line
        System.out.println("You have entered "+answer1);


input.close();
    }








}
