package day06_ifStatements;

/*
Declare the following variables:

1. num1
2. num2

3. Write a program that can print the minimum number between the
two numbers above, if both are equal then print Equal

Ex:

num1 = 10
num2 = 20

output:
10 is the minimum number
 */

public class MinimumNumber {
    public static void main(String[] args) {
       int num1 = -1;
       int num2 = 7;
        if (num1<num2){
            System.out.println(num1 + " is the minimum number");
        }
        if (num2 < num1) {
            System.out.println(num2 + " is a minimum number");
        }
       if(num1 == num2){
           System.out.println(num1 +" and "+ num2 + " are equal");
       }


    }




}
