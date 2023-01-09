package day07_Multibranch;


/*
An integer variable named score is declared and given, Write a
program that can print the grade of the student

Ex:
score = 95

output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
 */
public class GradeReport {
    public static void main(String[] args) {
        int score = 85;
        String result = "Your grade is : ";
        if (score>=90){
            result += "A";
        } else if (score>=80 && score <90) { // we don't have to use the 2nd condition in
            result+= "B";                   //this line , as its not gonna be executed unless the condition in a previous line (>=90) is false
        }else if (score>=70){
            result +="C";
        } else if (score>=60) {
            result +="D";
        }else{
            result +="F";
        }
        System.out.println(result);

    }





}
