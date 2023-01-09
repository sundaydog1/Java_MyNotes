package day05_operators;

public class RelationslOperators {

    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        System.out.println(a>b); // true
        System.out.println(b>a); //false

        boolean aIsgreater = a>b;
        System.out.println("aIsgreater = " + aIsgreater); //true

        System.out.println ("----------------------------------------");
        //_______________________________________________________

int score = 75;
boolean passed = score >=60;

        System.out.println("passed = " + passed);



        int age = 21;
        boolean eligibleToBuyAlcohol = age >=21;
boolean eligibleToVote = age >=18;
        System.out.println("eligibleToBuyAlcohol = " + eligibleToBuyAlcohol);
        System.out.println("eligibleToVote = " + eligibleToVote);


        System.out.println("-------------------------------------");

        score=48;
        boolean failed = score <60;
        System.out.println("failed = " + failed);


        System.out.println(100<2000);// true
        System.out.println(100<20);// false

        System.out.println("------------------------------------------");

        System.out.println('a'<'b'); // characters have corresponding numbers. and these numbers can be compared
    //                     65<66




    }
}
