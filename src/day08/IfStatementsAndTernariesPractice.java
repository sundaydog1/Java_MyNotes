package day08;

public class IfStatementsAndTernariesPractice {
    public static void main(String[] args) {
        int score =90;
        String result = "";

        if (score <=100 && score >=0){
         result = (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score >=60)? "D" :"F";

        }else{
            result = "Invalid Score";
        }
        System.out.println(result);











    }












}
