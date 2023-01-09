package day13_CustomMethod;
import java.util.Scanner;
public class ReturnStatements_Practices2 {
    public static void main(String[] args) {
        int number = new Scanner (System.in).nextInt();

        if (number<1 || number>7){
            System.out.println("invalid Number");
            return; // exit the main method
        }
        System.out.println( (number==1)?"monday":(number ==2)? "tuesday":(number==3)?"wednesday"
                :(number==4)? "thursday":"friday");





    }







}
