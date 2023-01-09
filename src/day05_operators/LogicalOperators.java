package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // Logical AND &&

        double salary = 60000;
        int creditScore = 550;
        int age = 25;

        boolean eligibleForLoan = salary >=30000 && creditScore >=650 && age>=18;
                                    //true       &&    false          &&   true
        System.out.println("eligibleForLoan = " + eligibleForLoan);

        age = 18;
        String country = "USA";
        boolean eligibleToVote = age >=18 && country=="USA";

        System.out.println(eligibleToVote);

        System.out.println("----------------------------------------");


        //Logical OR ||

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer =="no";
        System.out.println("validAnswer = " + validAnswer); //false

        System.out.println("----------------------------------------");
char grade = 'B';
boolean passedTheExam = grade =='A' || grade == 'B' || grade =='C' || grade == 'D';
        System.out.println("passedTheExam = " + passedTheExam);

        System.out.println("--------------------------------------------------");

        // NOT True !

        System.out.println(!true);  // false
        String answer1 = "yes";
        boolean yes = answer1 =="yes";
        boolean no = !yes;
        System.out.println("yes = " + yes); //true
        System.out.println("no = " + no); // false

        System.out.println("---------------------------------");
        System.out.println( true == !false  &&  false ==!true  &&  true !=!true);
        //                     true         &&   true          &&    true

    }
}
