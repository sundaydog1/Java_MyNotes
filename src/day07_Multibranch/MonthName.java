package day07_Multibranch;

/*
An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents

Ex:
Given:
number = 10

output:
October
 */

public class MonthName {
    public static void main(String[] args) {
        int n = 14;
        String month = "";
if (n>=1 && n<13){   // the condition is: n has to be between 1 and 12 in order to declare a month
    if(n==1) System.out.println("January");
    else if (n==2) System.out.println("February");
    else if (n==3) System.out.println("March");
    else if (n==4) System.out.println("April");
    else if (n==5) System.out.println("May");
    else if (n==6) System.out.println("June");
    else if (n==7) System.out.println("july");
    else if (n==9) System.out.println("september");
    else if (n==10) System.out.println("October");
    else if (n==11) System.out.println("November");
    else System.out.println("December");
}else{
    System.out.println("No such a month");
}
//----------------------------------------------

        char grade ='C';
        String result = "";

        if (grade >='A' && grade < 'G' && grade !='E'){
            System.out.println("Valid grade");
        }else System.out.println("Invalid grade");




    }




}
