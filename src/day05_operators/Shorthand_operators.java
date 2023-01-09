package day05_operators;

public class Shorthand_operators {
    public static void main(String[] args) {
        int a = 20;

        System.out.println(a);// 20


        a = 40;

        System.out.println(a); //40

        System.out.println("____________________________________________");

        double balance = 100;
        balance += 1000; // balance = 100+1000
        System.out.println("balance = " + balance); // 1100

        balance+=500; // balance = 1100+500
        System.out.println("balance = " + balance); //1600

        balance -=1000; //balance
        System.out.println("balance = " + balance);

        System.out.println("----------------------------------");

        double salary = 45000;
        salary *= 2; // salary = 450002*2
        System.out.println("salary = " + salary); //90000

        salary*=3; //90000*3
        System.out.println("salary = " + salary); //270000.0


        System.out.println("------------------------");
        double eth = 4;
        eth *=250;
        System.out.println("eth = " + eth);

        //----------------------------------------------------------------

        eth /=2;
        System.out.println("eth = " + eth);

        salary /=2;
        System.out.println("salary = " + salary);


        System.out.println("-----------------------------------------");

        int b = 39;
        b%=7; // b = 39%7
        System.out.println("b = " + b);







    }
}
