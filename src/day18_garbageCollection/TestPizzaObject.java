package day18_garbageCollection;

public class TestPizzaObject {
    public static void main(String[] args) {

       Pizza pizza1 = new Pizza();
        pizza1.size='M';

        Pizza pizza2 = new Pizza();
        pizza2.size = 's';

        pizza2.setInfo('s',1, 2);


        System.out.println(pizza2); // toString method gets executed automatically, no need to pass this method manually

        System.out.println("-----------------------------------------");

        double total = 0;

        for (int i = 0; i <20 ; i++) {
            Pizza small = new Pizza();
            small.setInfo('s',2,2);
            total += small.calCost();

            Pizza medium = new Pizza();
            medium.setInfo('m',3,4);
        total += medium.calCost();

            Pizza large = new Pizza();
            large.setInfo('L',4,5);
            total += large.calCost();
        }
        System.out.println("total cost = $"+total);

























    }
}
