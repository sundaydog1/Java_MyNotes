package day16_DoWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;
        for(;condition;){ // if the condition is false the For loop won't be executed
            System.out.println("Hello Cydeo --- For Loop");
        }

        System.out.println("--------------------------------");

        while(condition){ // if the condition is False  the While Loop won't be executed
            System.out.println("Hello Cydeo --- While Loop");
        }

        System.out.println("-------------------------");

        do{
            System.out.println("Hello Cydeo --- Do While Loop");
        }while(condition);  // this statement will be executed at least once, regardless
        // of the condition. but if the condition is true it will be executed again,
        // otherwise it will exit the loop






    }







}
