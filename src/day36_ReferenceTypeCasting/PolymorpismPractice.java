package day36_ReferenceTypeCasting;


import day30_OOP_Inheritance.phoneTask.*;

/*
1. print the model, color and price of each phone object in the following format
    				model - color - price
	2. How many Iphones in the array of phones?
	3. How many Samsungs in the array of phones?
	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */
public class PolymorpismPractice {
    public static void main(String[] args) {

        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Medium", 900, "Black"),
                new Iphone("Iphone 12 Pro Max", "Large", 1200, "Silver"),
                new Iphone("Iphone 9", "Large", 800, "White"),
                new Samsung("Galaxy S19", "Medium", 700, "Pink"),
                new Samsung("Galaxy S20", "Large", 850, "Silver"),
                new Samsung("Galaxy S21", "Large", 950, "Black"),
                new Nokia("XR20", "Small", 350, "White"),
                new Nokia("G10", "Medium", 99, "Pink"),
                new Nokia("G50", "Large", 250, "Silver"),
                new Iphone("Iphone 12 Pro", "Medium", 1200, "Black"),
                new Iphone("Iphone 11 Pro Max", "Large", 1100, "Silver"),
                new Samsung("Galaxy S18", "Large", 750, "Silver"),
                new Samsung("Galaxy S17", "Large", 650, "Gold"),
                new Nokia("G10", "Medium", 99, "Black"),
                new Iphone("Iphone 6", "Small", 400, "Gold"),
                new Iphone("Iphone 7", "Small", 500, "Black")
        };


        for (Phone each : phones) {
            System.out.println(each.getModel() + " - " + each.getColor() + " - " + each.getPrice());
        }
        System.out.println("----------------------------------");

        int countIphone = 0;
        int countSamsung = 0;
        for (Phone each : phones) {
            if (each instanceof Iphone) { // if the phone is Iphone
                countIphone++;
            }
            if (each instanceof Samsung) { // if the phone is Samsung
                countSamsung++;
            }
        }
        System.out.println(countIphone);
        System.out.println("countSamsung = " + countSamsung);


        System.out.println("-----------------------------");


        for (Phone each : phones) {
            if (each instanceof Iphone || each instanceof Samsung) {
                if (each.getPrice() >= 700) {
                    System.out.println(each.getModel());
                }
            }
        }

    }
}