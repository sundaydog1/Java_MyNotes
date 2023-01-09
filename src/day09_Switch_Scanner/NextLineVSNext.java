package day09_Switch_Scanner;

import java.util.Scanner;

public class NextLineVSNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();


        input.nextLine(); // additional nextLine used to clear the scanners memory
        System.out.println("Enter your full name:");
        String fullName =input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);



    }




}
