package day06_ifStatements;

/*
Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */

public class IdentifyNumber {
    public static void main(String[] args) {
int number = 200;
boolean isPositive = number>0; // if a number is greater than zero, than it's positive
boolean isNegative = number<0; // if the number is less than 0, than its negative
// boolean isZEro = number == 0;
        boolean isZero = !isPositive && !isNegative;

        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);

        System.out.println(number +" is positive: "+isPositive);
        System.out.println(number+ " is negative: " +isNegative);
        System.out.println(number+ " is zero: " +isZero);




    }


}
