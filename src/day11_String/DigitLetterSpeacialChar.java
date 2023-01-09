package day11_String;
/*
Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
 - if the word starts with digits, print "first character is digit"
 - if the word starts with uppercase letters, print "first character is lowercase letter"
- if the word starts with lowercase letters, print "first character is uppercase letter"
- if the word starts with special characters, print "first character is special character"
        	HINT: You need to check the ascii table
 */


import java.util.Scanner;
public class DigitLetterSpeacialChar {
    public static void main(String[] args) {
        String str = new Scanner (System.in).nextLine(); // means the Scanner will be used only once

        if (str.length()>=1){ // precondition: there has to be at least 1 character in the string

            char first = str.charAt(0); // the first character of String
          // if (first >=48 && first<=57) { // numbers are taken from ASCII table and represent digits
            if (first>= '0' && first <='9'){
                System.out.println("first character is digit");
            }else if (first>='A' && first <='Z'){
                System.out.println("The first character is uppercase letter");
            }else if ( first >='a' && first <='z'){
                System.out.println("First character is lowercase letter");
            }else{
                System.out.println("First character is special character");
            }
        }else{
            System.out.println("String is empty");
        }










    }









}
