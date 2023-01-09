package day09_Switch_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddOrEvenScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();
        String result = "";
        result = (num%2==0)? "Even":"Odd";
        System.out.println(result);
        input.close();




    }









}
