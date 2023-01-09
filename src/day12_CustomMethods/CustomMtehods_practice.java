package day12_CustomMethods;

public class CustomMtehods_practice {
    public static void main(String[] args) {

        maxNum(9,-1);
initials("Tatiana","Kuvsynova");




    }

    // a method that can print the maximum number between 2 numbers, if both are equal, then
    // it prints "Equal"
    public static void maxNum ( double num1, double num2){
        if (num1>num2){
            System.out.println(num1+ " is the maximum number");
        }else if(num2>num1){
            System.out.println(num2 + " is the maximum number");
            }else{
            System.out.println("Equal");
        }
    }

    //a method that can display the initials of a person

    public static void initials (String firstName, String lastName){
        String initial = firstName.charAt(0)+ "."+ lastName.charAt(0);
        System.out.println(initial);
    }




}
