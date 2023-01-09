package day35_Polymorphism.transportationTask;

public abstract class Car extends Transportation {
    public Car( String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

   // since Car class is abstract , no need to override abstract methods from transportation class

public void drive(){
    System.out.println("Driving "+getMake()+" "+getModel());
}



}
