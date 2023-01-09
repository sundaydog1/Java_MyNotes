package day16_DoWhileLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password;
        int attempt = 3;
        do {
            System.out.println("Enter your username:");
            username=input.next();
            System.out.println("Enter your password");
            password=input.next();

            attempt--;

            if (attempt==0){
                break;
            }
        }while (!(username.equals("Cydeo")&& password.equals("WoodenSpoon"))); //while the credentials are invalid








    }





}
