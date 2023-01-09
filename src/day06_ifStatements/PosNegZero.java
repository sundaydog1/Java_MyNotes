package day06_ifStatements;

/*
An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero

Ex:

number = 20

output:
Positive
 */
public class PosNegZero {
    public static void main(String[] args) {
        int number = 31;
         if(number>0){
             System.out.println(number + " is positive");
         }
         if (number<0){
             System.out.println(number+ " is negative");
         }
         if (number ==0){
             System.out.println(number + " is zero");
         }



    }



}
