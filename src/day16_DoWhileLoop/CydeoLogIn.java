package day16_DoWhileLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{ //otherwise

            for (int i = 0; i <3 ; i++) { // this loop will be executed if the user enteres wrong info . the user has 3 attempts
              if (i !=2){ // on the first two attempts this message will be displayed
                  System.out.println("Incorrect password or username.Please re-enter");
              }else{ // on the 3rd attempt this message will be displayed
                  System.err.println("This is your last attempt. Please re-enter your username and password");
              }
                System.out.println("Enter your username:");
                username = input.next();
                System.out.println("Enter your password:");
                password = input.next();

                if (username.equals("Cydeo")&&password.equals("Wooden Spoon")){ // if the user provides valid credentials
                    System.out.println("You are now logged in");
                    break; // break statement will exit the loop
                }
            }
            if (!(username.equals("Cydeo")&& password.equals("WoodenSpoon"))){ // if even after 3 attempts, the user didnt provide the correct info ==>the account will be locked
                System.err.println("Your account is now locked, please contact the support team");
            }



        }


    }

    // creating a method, that we can use in For Loop

    public static void cydeoLogIn(String username,String password){
        if (username.equals("Cydeo")&& password.equals("WoodenSpoon")){
            System.out.println("Logge in");
        }else{
            System.out.println("Invalid credentials");
        }
    }












}
