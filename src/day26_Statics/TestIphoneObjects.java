package day26_Statics;

public class TestIphoneObjects {
    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("iPhone12","black",1000);
        System.out.println(iPhone1.color);
        System.out.println(iPhone1.model);
        System.out.println(iPhone1.price);

        iPhone1.printPhoneInfo();

        System.out.println(iPhone1.brand); // static variables have to be called through the class, not the object
        System.out.println(iPhone1.operatingSystem);// static variables have to be called through the class, not the object

        IPhone.printOperatingSystem();// static methods have to be called through the class, not the object










    }
}
