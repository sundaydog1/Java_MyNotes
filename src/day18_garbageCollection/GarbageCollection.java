package day18_garbageCollection;

import day17_CustomClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

    String s1 = "Java";
    s1 = null;  // null keyword doen't take any memory. object "Java" has been unreferenced, so it will be eligible for garbage collection
        System.out.println(s1); // ==> "NullPointerException" will be displayed
        // no methods or variables cann be called through null
        // null means something that doesn't exist

        System.out.println("-----------------------------------------");
        String str1 = "Python"; //== > becomes eligible for garbage collection, as str1 is reassigned to "Cydeo"
        str1 = "Cydeo";
        System.out.println(str1);

        System.out.println("---------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Jesse","Schnauzer",'F',8,"small","black and silver");

        Dog dog2 = new Dog();
        dog2.setInfo("Mia","sherpei",'F',8,"medium","blue");

 // dog1 = null; ==> will make dog1 eligible for garbage collection
        dog1=dog2; // //==> will make object "Jesse" eligible for garbage collector
        System.out.println(dog1);
        System.out.println(dog2);

// new Dod().finalize(); // ==> the method that garbage collector uses.
        // every single object jas finalize method! it comes from Object Class

    }
}
