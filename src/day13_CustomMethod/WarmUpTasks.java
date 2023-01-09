package day13_CustomMethod;

import java.util.Scanner;

/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)
	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"
	        Ex:
	            calculate(10, 20, '+')
	        output:
	            10 + 20 = 30
	2. Create a method named ageGroup that can print the age group of the person
	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )
    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)
	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)
	        output:
	            You are eligible to vote
 */
public class WarmUpTasks {
    static public void main(String[] args) { // access -modifier (public) and specifier (static) can be switched
        // without any issue for the code
        // the preferred way is to have access-modifier first

        // you also can create a method without access - modifier or specifier.
        // but you can't create the method without returnType and methodName

        // parameter is optional

        calculate(20,5,'/');
calculate(10,70,'-');

   //     Scanner input = new Scanner (System.in) ;
 //       System.out.println("Enter your two numbers and a math operator");

 //       double n1 = input.nextDouble(),
 //               n2 = input.nextDouble();
 //       char operator = input.next().charAt(0);

 //       calculate(n1,n2,operator);

        ageGroup(97);

    }


    public static void calculate(double num1, double num2, char mathOperator){
        double result =0 ;
        switch(mathOperator){
            case '+':
                result = num1+num2;
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+result);
                break;
            case '-':
                result=num1-num2;
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+result);
                break;
            case '/':
                result=num1/num2;
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+result);
                break;
            case'*':
                result=num1*num2;
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+result);
                break;
            default:
                System.err.println("Invalid operator");
        }

    }

    public static void ageGroup (int age){
        if (age>0 && age<=150){
            System.out.println((age<=21)? "Teenager":(age<55)? "Adult": "Senior");

        }else{
            System.err.println("Invalid age");
        }
    }

























}
