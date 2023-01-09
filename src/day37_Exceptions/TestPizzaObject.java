package day37_Exceptions;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza ('S',2,3);
        Pizza pizza2 = new Pizza ('S',2,3);

        System.out.println(pizza1.equals(pizza2));

        System.out.println("----------------------------------");
        
        Object obj = new Pizza ('L',4,5); // upcasting (Object -Pizza),
        // happens in the background

        System.out.println(obj.equals(pizza2));

        double total = ((Pizza)obj).calcCost();
        System.out.println(total);
    }
}
