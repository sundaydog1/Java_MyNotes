package day32_FinalKeyword.carTask_Overriding;

public class TestCarObject {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry","Silver",2010,25000);

        Audi audi = new Audi("Q6","White",2021,50000);

        Tesla tesla = new Tesla("Model 3","White",2022,65000);

        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("------------------------");


        toyota.start();
        audi.start();
        tesla.start();

        System.out.println("----------------------------");


        tesla.setPrice(30000); // ==>Invalid price
        System.out.println(tesla);
    }
}
