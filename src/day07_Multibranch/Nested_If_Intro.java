package day07_Multibranch;

public class Nested_If_Intro {
    public static void main(String[] args) {
        int score = -5;

        if(score >=0 && score <=100){

            if (score >=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }


        }else{
            System.out.println( "Invalid Score");
        }

        System.out.println("------------------------------------------");
        int age =64;
        if (age>1 && age <=110){
            if(age>=21){
                System.out.println("Eligible");
            }else{
                System.out.println("Not eligible");
            }
        }else{
            System.out.println("Invalid age");
        }




    }



}
