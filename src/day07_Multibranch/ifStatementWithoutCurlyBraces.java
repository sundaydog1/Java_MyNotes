package day07_Multibranch;

public class ifStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int age = 32;
        if (age >=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }

        System.out.println("--------------------------------------------");

        if (age>=21) System.out.println("eligible"); // only possible if there is 1 condition within the block
        else System.out.println("Not eligible");

        System.out.println("--------------------------");

        int day = 2; // 1~7
        if(day ==1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day ==4) System.out.println("Thursday");
        else if (day ==5) System.out.println("Friday");
        else if (day==6) System.out.println("Saturday");
        else System.out.println("Sunday");


        // IF STATEMENT WITHOUT THE CURLY BRACES IS NOT A GOOD PRACTICE
        }


    }







