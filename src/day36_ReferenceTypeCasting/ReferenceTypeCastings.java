package day36_ReferenceTypeCasting;
import day29_Inheritance.animalTask.*;
import day30_OOP_Inheritance.phoneTask.Iphone;
import day30_OOP_Inheritance.phoneTask.Nokia;
import day30_OOP_Inheritance.phoneTask.Phone;
import day35_Polymorphism.transportationTask.AutoPilot;
import day35_Polymorphism.transportationTask.Electric;
import day35_Polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog = new Dog();

Animal animal = new Dog(); // parent referencing to a child ==> upcasting (happens implicitly)
// the upcasting is needed to achieve the polymorphism


        System.out.println("--------------------------------------");

        Animal animal1 = new Dog();
        ( (Dog) animal1).bark(); // Paranthesis are important! Down casting for 1 time use

        Dog dog1= (Dog)animal1; // we are still using the same object
        // that was reassigned to a new variable dog1. down casting for multiple use
        dog1.bark();

        ((Cat) animal1).scratch(); // ===> ClassCastException (happens when there is no IS A relationship
        // between two classes , that we perform casting with (Dog and Cat)
        // we can't convert(cast) animal1 (dog object) to a Cat class, we also can't call scratch method
        // from a dog object, though the casting might seem successful before we actually run the code

        System.out.println("----------------------------------");

        Phone phone = new Nokia("XR20","Small",100,"Black");
phone.call(911);
        ((Nokia)phone).selfDefence(); // casting parent class(Phone) to a child class(Nokia)==> down casting

   //     ((Iphone)phone).faceTime(123456);// Nokia can not be converted to Iphone,
                                         // as there is no IS A relationship between them

        System.out.println("----------------------------------------");

        Electric electric = new Tesla("Tesla","Model Y","Blue",2020,55000);
        electric.charge();
        ((Tesla)electric).selfDrive();
        ( (AutoPilot)electric).selfDrive();

    }
}
