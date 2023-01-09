package day12_CustomMethods;
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */
import java.util.Scanner;
public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name:");
        String first = input.nextLine();
        System.out.println("Enter your last name:");
        String last = input.nextLine().trim(); // we can call TRIM method to eliminate possible spaces in the input

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        // getting the 1st character of first name + getting the remaining characters
        System.out.println(first);

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        System.out.println(first +" "+ last);

input.close();

























    }





















}
