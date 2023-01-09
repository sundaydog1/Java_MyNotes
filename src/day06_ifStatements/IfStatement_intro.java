package day06_ifStatements;

public class IfStatement_intro {
    public static void main(String[] args) {


        int number = 100;

        boolean isPositive = number > 0;
        if(isPositive) {
            System.out.println(number + " is positive");  // this fragment can be executed only under the condition
        }


        number = -10;
        isPositive=number >0;
        if(isPositive) {
            System.out.println(number + " is positive");  // this fragment can be executed only under the condition
        }


        System.out.println("----------------------------------------");


        int num = 0;
        if(num>0){
            System.out.println(num+ " is positive");
        }
        if(num<0){
            System.out.println(num + " is negative");
        }

        if (num == 0){
            System.out.println(num+ " is zero");
        }
    }
}

