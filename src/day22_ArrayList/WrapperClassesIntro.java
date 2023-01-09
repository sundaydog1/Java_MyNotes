package day22_ArrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int a1 = 10;
        Integer a2 =10;

        System.out.println("--------------------------------");
        int b1=100;
        Integer b2 = b1; // auto-boxing
    //    Long b3 = b1; // you can't assign to a different object type


char ch = 'A';
Character ch2 = ch;   // autoboxing

        double d1 =5.5;
        Double d2 = d1;  // autoboxing

        System.out.println("--------------------------------------");


        Integer n1=20;
        int n2 = n1; // unboxing
 //       long n3 = n1; // not gonna give an error, but its better to convert to its own primitive
 //       double n4=n1;

        char e1 = 'Z'; // unboxing
        char e2 = e1;





    }
}
