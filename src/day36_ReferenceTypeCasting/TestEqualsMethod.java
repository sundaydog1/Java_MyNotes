package day36_ReferenceTypeCasting;



public class TestEqualsMethod {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);

        System.out.println(circle1==circle2); // false // as it checks the memory allocation of two objects

        System.out.println(circle1.equals(circle2)); //true

        Circle circle3 = new Circle(15);

        System.out.println(circle1.equals(circle3));// false
        System.out.println("===================================================");

        IPhone iphone1 = new IPhone("Apple","Iphone 12","Medium","Black",900);
        IPhone iphone2 = new IPhone("Apple","Iphone 12","Medium","Blue",1000);


   //     System.out.println(iphone1.equals(circle1)); // ==>invalid object
        System.out.println(iphone1.equals(iphone2)); // false ==> colors are different

    }
}
