package day26_Statics;

public class IPhone {
    public static String brand="Apple";// all the iphone objects have the same brand ->Apple
    public String model; // instance : models cn be different for different objects of this class
    public String color;
    public double price;
    public static String operatingSystem="iOS"; // the operating System is the same for all iPhone objects;
    public static String madeIn = "China";
public static boolean isTouchScreen = true;


public  void printPhoneInfo(){ // instance method accepts both instance and static variables
    System.out.println("brand = " + brand);
    System.out.println(color);
    System.out.println("model = " + model);
    System.out.println("price = " + price);
}

public static void printOperatingSystem(){ // static method can only accept static variables
    System.out.println(operatingSystem);
}

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
