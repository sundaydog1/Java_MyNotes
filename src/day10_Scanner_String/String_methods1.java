package day10_Scanner_String;

import java.util.Scanner;

public class String_methods1 {
    public static void main(String[] args) {

     // charAt() method

        String str = "Cydeo";
        // index:     01234

        char firstCharacter = str.charAt(0);
char secondCharacter = str.charAt(1);
char fifthCharacter = str.charAt(4);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("secondCharacter = " + secondCharacter);
        System.out.println("fifthCharacter = " + fifthCharacter);


        System.out.println("---------------------------------");

        // length method ===> total number of the characters

        String sentence = "Java Programming Language";

        int length = sentence.length();
        System.out.println(length);
       
        System.out.println("-----------------------------------------");
        
        String s1 = "Wooden Spoon";
        char first  = s1.charAt(0);
        int lastIndexNumber = s1.length() - 1;
        char last = s1.charAt(lastIndexNumber);
        System.out.println(first+" "+ last);

        System.out.println("-------------------------------------------");

        // equals method
        String name1 = "Umran";
        String name2 = new String ("Umran");
        System.out.println(name1.equals(name2));

        System.out.println("-----------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = "java";
        String r4 = new String("Java");

        System.out.println(r1==r2); //true
        System.out.println(r1==r4); //false
        System.out.println(r1.equals(r4));// true
        System.out.println(r2.equals(r4)); // true

        System.out.println("--------------------------------");

        Scanner input = new Scanner (System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Are you a US citizen?");
        String citizen = input.next();

        if (age>=21 && citizen.equals("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible");
        }

input.close();

        
        
    }






}
