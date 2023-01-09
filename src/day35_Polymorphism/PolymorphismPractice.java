package day35_Polymorphism;

import day34_Interface.animalTask.*;

import day35_Polymorphism.transportationTask.*;
import day35_Polymorphism.transportationTask.CydeoCar;


public class PolymorphismPractice {
    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();   // we can only call the method that are in Animal object
        tiger.drink(); // but the implementation of these methods will be as in Tiger class
        tiger.sleep();
        //  tiger.hunt(); // hunt doesn't exist in Animal class

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        // animal.fly(); // fly method doesn't exist in Animal class
        animal.eat(); // implementation of eat method for Eagle
        animal.sleep();
        animal.drink();


        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        ;
        // obj1.eat(); // Flyable has only method fly in its interface
        // obj1.drink();
        // obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);


        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = {parrot, eagle, duck, cydeoCar};


        Playable[] friendlyAnimals = {dog, cat, duck};


        boolean isAnimal = dog instanceof Animal; // to check if dog came from ANimal class


        System.out.println(isAnimal);

        System.out.println("------------------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla; // to check if car object belongs to Tesla Class //true
        boolean isAudi = car instanceof Audi; // to check if car object came from Audi class
                                            // ==> false (it was created from Tesla class)

        boolean isElectricCar = car instanceof Electric; // to check if car object is Electric car//true
        boolean hasAutoPark = car instanceof Autopark; //true
        boolean hasAutoPilot = car instanceof AutoPilot;//true


        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);

        System.out.println("------------------------------------------------");


    }
}