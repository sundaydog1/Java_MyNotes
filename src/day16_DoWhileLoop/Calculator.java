package day16_DoWhileLoop;
/*
Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.toLowerCase().equals("yes")) {

            System.out.println("Enter first number:");
            double num1 = input.nextDouble();


            System.out.println("Enter math operator:");
            char mathOperator = input.next().charAt(0);

            while (!(mathOperator == '*' || mathOperator == '+' || mathOperator == '-' || mathOperator == '/')) { // while the operator is invalid
                System.err.println("Invalid operator! Please re-enter the math operator"); // the loop will give this message and ask to provide the valid operator
                mathOperator = input.next().charAt(0); // we need to make sure the user provides an input
            }


            System.out.println("Enter second number");
            double num2 = input.nextDouble();


           /* double result=0;

                            we can use eiter swith or branch IF statement or ternarary
          switch (mathOperator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
            }


           */
            double result = (mathOperator=='+')? num1+num2 :(mathOperator=='-')?num1-num2
                    :(mathOperator=='*')?num1*num2:num1/num2;

            System.out.println(result);

            System.out.println("Would you like to continue? yes/no");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) { // while the answer is invalid
                System.err.println("Invalid answer! Would you like to continue? yes/no"); // we should display this message and ask to re-enter
                answer = input.next().toLowerCase();// the new answer needs to be assigned to the same variable
            }

        }


    }
}