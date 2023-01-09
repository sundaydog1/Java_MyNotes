package day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {
        // -------------Implicit Casting------------

        byte a = 15;
        short b = a;
        int c = a;
        System.out.println("b = " + b);
        System.out.println(a);

        long d = 3000L;
        float f = d;


        //------------Explicit Casting------


        int x = 100;
        byte g = (byte)x;


        float z = 20.8F;
        short q = (short)z; // q = 20 as short can take oly integer value

        double n1 = 2.5;
        byte n2 = (byte) n1; // n1 = 2.5, but the output will be 2 as byte works for whole numbers only
        System.out.println(n2);


        //---------------------------------------------------------------

        int number1 = 500;
        byte number2 = (byte)number1; // byte cant contain more than 128
        System.out.println(number2);
        int r = 40000;
        short t = (short) r;
        System.out.println(t);

        int k1 = 100;
        double k2 = k1;
        System.out.println(k2);





    }

}
