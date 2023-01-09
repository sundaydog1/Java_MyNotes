package day06_ifStatements;

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
        int num = 4;
        String result = "";
        if(num ==1){
            result = "January";
        }
        if (num==2){
            result = "February";
        }
        if (num ==3){
            result = "March";
        }
        if( num==4){
            result= "April";
        }
        if (num==5){
            result = "May";
        }
        if (num ==6){
            result = "June";
        }
        if (num==7){
            result = "July";
        }
        if (num ==8){
            result = "August";
        }
        if(num ==9){
            result="September";
        }
        if (num == 10){
            result = "October";
        }
        if(num==11){
            result = "November";
        }
        if(num ==12){
            result = "December";
        }
        System.out.println(result);
    }





}
