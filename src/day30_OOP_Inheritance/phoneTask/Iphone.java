package day30_OOP_Inheritance.phoneTask;

public class Iphone extends Phone{ // Iphone is a Phone




    public static boolean hasApplePay = true;

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }


    public void faceTime(long phoneNumber){
        System.out.println(getModel() +" is face timing with "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(getModel()+" is face timing with "+email);
    }



}
