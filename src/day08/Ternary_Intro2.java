package day08;

public class Ternary_Intro2 {
    public static void main(String[] args) {
        int number = 100;

   /*     String result = "";
        if(number>0) {
            result = "Positive";
        } else if (result<0) {
            result = "Negative";
    }else {
            result = "Zero";
        }
      */

        String result = (number >0) ? "Positive" :(number<0) ? "Negative" : "Zero";
        System.out.println(result);

        System.out.println("------------------------------------------------------");
  int n = 3; //1-7
 // String day = "";

  String day = (n==1) ?"Monday" :(n==2) ? "Tuesday" :(n==3)?"Wednesday":(n==4)? "Thursday"
          :(n==5)? "Friday" :(n==6)?"Saturday" : "Sunday";
        System.out.println(day);

        System.out.println("-----------------------------");

        int num = 10; //1-12

        String month = (num==1)? "January":(num==2)? "February":(num==3)? "March":(num==4)? "April"
                :(num==5)? "May" :(num==6)? "June" :(num==7)? "July" :(num==8)? "August"
                :(num==9)?"September" :(num==10)?"October":(num==11)? "November":"December";
        System.out.println(month);


    }








}
