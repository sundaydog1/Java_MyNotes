package day31_ProtectedAccessModifier_MethodOverriding.warmUpTask;

public class Boat extends Vehicle{

    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

public void sail (){
    System.out.println(getBrand()+" "+ getModel()+" is sailing");
}

}
