package day06_ifStatements;

public class IfAndElse_Intro {
    public static void main(String[] args) {
        int age = 28;
        if (age>21){
            System.out.println("Eligible");
        }

        if(age<21){
            System.out.println("Not Eligible");
        }

        System.out.println("-----------------------------------");

        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }


    }

}
