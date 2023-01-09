package day12_CustomMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {
        oddOrEven(100);
        oddOrEven(7);
        eligibleOrNot(28);
eligibleOrNot(16);
score(75);
score(39);

    }
// the method takes a number , and verifies if it's odd or even
    public static void oddOrEven (int number){

        if (number%2==0){
            System.out.println( number+ " is even number");
        }else{
            System.out.println(number+ " is odd number");
        }
    }

    // a method that can check if a person is eligible to buy alcohol
    public static void eligibleOrNot(int age){
        if( age >=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

    }

    // create the method to verify students score
     public static void score (int score){
        String result = (score>=90)?"A":(score>=80)?"B" :(score>=70)? "C":(score >=60)?"D":"F";
         System.out.println("The score is "+result);
     }



}
