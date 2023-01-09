package day04_concatenation;

import java.sql.SQLOutput;

/*
Create a class named FullName.java
2. Declare the following variables:
1. firstName
2. lastName

3. Use concatenation to print the full name
Ex:
Your full name is Daniel Jefferson
 */
public class FullName {

    public static void main(String[] args) {

        String firstName = "Tetiana",
                lastName = "Kuvshynova";
        String fullName = firstName + " "+ lastName;

        System.out.println("Your full name is "+fullName);
        System.out.println("Your full name is "+firstName+ " "+ lastName);

        String fullName1 ="Tetiana Kuvshynova";
        System.out.println("Your full name is "+ fullName1);

    }
}
