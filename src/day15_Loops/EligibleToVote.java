package day15_Loops;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your age:");
        int age  = input.nextInt(); // if the first time the user enters a valid age, the while loop won't be executed

        while (! (age>=1&& age<=120)){ // while the age is not valid
            System.err.println("Invalid entry! Please re-enter your age:");
         age =    input.nextInt();
        }
        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while (! (yesOrNo.equals("yes")||yesOrNo.equals("no"))) { // while the answer is neither yes nor no
            System.err.println("Invalid entry! Please re-enter");
            System.err.println("Are you a US citizen? Yes/No");
            yesOrNo = input.next().toLowerCase();
        }

if(age>=21 && yesOrNo.equals("yes")){
    System.out.println("You are eligible to vote");
}else{
    System.out.println("You are not eligible to vote");
}

input.close();









    }
















}
