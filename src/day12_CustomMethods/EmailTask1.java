package day12_CustomMethods;
/*
Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.
            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */
public class EmailTask1 {
    public static void main(String[] args) {

        String email = "mike_tysons@gmail.com";
        String firstName = email.substring(0, email.indexOf("_"));
        // to figure out the first name we need to substring from 0 until underscore
        // we use indexOf to find the index of underscore
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@")); //from the first letter after _ until @
        String domain = email.substring(email.indexOf("@")); // everything after@ (including it) will be domain

        email = lastName+"_"+firstName+domain;
        System.out.println(email);


































    }
























}
