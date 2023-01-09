package day15_Loops;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {

         if(i==6){ // if i's value reaches 6
             break; // exits the loop
         }

            System.out.println(i); // will print 6 times only
        }

        System.out.println("----------------------------------------");

        /*
        the position of break statement depends on what we are trying to achieve
        if we want J to be printed than we have to use break after print statement
        if we dont want to include J, we should use break before the prin statement
         */
        for (int i = 'A'; i <'Z' ; i++) {
            System.out.println(i);
            if (i=='J'){
                break;  // J will be printed in this case
            }
        }
        for (;;){ // we created an infinite loop
            System.out.println("Hello"); // without the break "Hello" will be printed endless number of times
            break; // it will terminate the loop right the way and "Hello" will be printed only once
        }

    }






}
