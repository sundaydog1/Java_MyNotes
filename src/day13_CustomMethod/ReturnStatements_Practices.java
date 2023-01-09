package day13_CustomMethod;

import java.util.Scanner;

public class ReturnStatements_Practices {
    public static void main(String[] args) {

       char grade = new Scanner(System.in).next().charAt(0);

       boolean isValid = grade=='A'|| grade =='B'|| grade=='C'|| grade =='D'|| grade =='F';
       if (!isValid){ // if the grade is not valid
           System.err.println("Invalid grade");
           return; // it will terminate the main method right the way and won't execute anything below this line
       }
        System.out.println( (grade=='A')? "Excellent":(grade=='B')? "Great job":(grade=='C')
        ? "Good":(grade=='D')?"Passed":"Failed");


        }
    }

