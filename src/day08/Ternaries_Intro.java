package day08;

public class Ternaries_Intro {
    public static void main(String[] args) {
        int score = 85;
        String result = "";  // "" turn grey in Java it means the variable has been assigned
                             // so  we dont have to use ="" and can simply declare variable
                                // as String result;
        if (score>=60){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);

        System.out.println("----------------------------------------------");


       String result2 = (score>=60) ? "Passed" : "Failed";


        System.out.println(result2);


        System.out.println("----------------------------------------------");

        int age = 34;
      /*  String result;
        if (age>=21){
            result3 = "Eligible";
        }else{
            result3 = "Not Eligible";
        }
      */
        String result3 =(age>=21) ?"Eligible":"Not Eligible";
        System.out.println(result3);


    }




}
