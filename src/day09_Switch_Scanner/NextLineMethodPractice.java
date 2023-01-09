package day09_Switch_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine(); //when nextLine is Used after nextLine there is
                                              // no need for additional nextLine method

        System.out.println("Enter your age:");
        int age = input.nextInt();


        input.nextLine(); // extra nextLine method

        System.out.println("Enter your full address:");
        String address = input.nextLine(); // since the previous method was nextInt and now
                                            // we need to use nextLine we need to use an extra
                                            // nextLine method to clear the scanner's memory

        input.close();



    }



}
