package day06_ifStatements;

/*
An integer variable named month is declared and given, Write a
program that can print the number of days in the given month

Ex:
Given:
number = 1

output:
31 days

Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */
public class NumberOfDays {
    public static void main(String[] args) {
        int n = 10;
        boolean has28Days = n==2;
        if(has28Days){
            System.out.println("28 days"); // if the month number is 2 (February), it has 28 days
        }

        boolean has30Days= n==4|| n==6 || n==9|| n==11;
        if(has30Days){
            System.out.println("30 days");
        }

        boolean has31Days = !has30Days && !has28Days ;// if the month doednt have 30 days and doesn't
        //have 28 days, then it has 31 day
        if(has31Days){
            System.out.println("31 days");
        }




    }



}
