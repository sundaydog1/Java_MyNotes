package day14_MethodOverloading;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i=5; i<=10; i++){
            System.out.println("Hello Cydeo!");
        }
        for (int i=10;i>=5;i--){
            System.out.println("Hello world!"+i);
        }

        System.out.println("---------------------------------------------");

        // sum of all the number  btween 1~100
        // print all the alphabet letter from A toZ

       int sum =0;
        for (int i=1;i<=100;i++){
            sum +=i; // to find the sum every new number will be added each time the loop runs
        }
        System.out.println(sum);


        for (char i ='A'; i <= 'Z'; i++){
            System.out.print(i+" "); // to print the characters A~Z in one line
        }
        System.out.println();

// print all the alphabet letters backwards Z~A

     for (char i ='Z'; i>='A';i--) {
         System.out.print(i + " ");
     }
        System.out.println();

    }














}
