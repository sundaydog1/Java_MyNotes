package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        // pre increment/decrement

        int x = 10;
        System.out.println(++x); //11
        System.out.println(x);// will be 11 as pre increment saves in the memory


        int y = 100;
        System.out.println(--y); //99
        System.out.println("y = " + y);

        System.out.println("______________________________________________________");

        // post increment/decrement

        int a = 50;
        System.out.println(a++); //50
        System.out.println(a); //51

        int b = 25;
        System.out.println(b--); //25
        System.out.println(b--); //24


        int z = 60;
        int q = z--; // q= 60, z = 59
        System.out.println("z = " + z);
        System.out.println("q = " + q);
    }
}
