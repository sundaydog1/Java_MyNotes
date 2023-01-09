package day30_OOP_Inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {


        Iphone iphone = new Iphone("13 Pro", "Large", 1200, "Black");
        Samsung samsung = new Samsung("Galaxy s22", "Medium", 1000, "White");
        Nokia nokia = new Nokia("Brick", "Small", 50, "Silver");

        iphone.call(911);
samsung.call(911);
nokia.call(911);


iphone.faceTime(8653082067L);
samsung.freeze();
nokia.selfDefence();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}