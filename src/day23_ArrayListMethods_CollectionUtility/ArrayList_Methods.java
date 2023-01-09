package day23_ArrayListMethods_CollectionUtility;


import java.util.ArrayList;
public class ArrayList_Methods {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        array [0]=100;

        System.out.println("------------------------------------------------");

        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("Eggs");
        groceries.add("Paper towels");
        groceries.add("Apples");
        groceries.add("Cooking oil");

        System.out.println(groceries);

        // to update the certain element we can use set method
        groceries.set(2,"Oranges"); // to change Apples for Oranges

        System.out.println(groceries);

        System.out.println("------------------------------");

        // to remove an element

        groceries.remove(0); // if we pass int in this method
        // ==> it'll be treated as an index and an element at this index will be removed;

        groceries.remove("Cooking oil"); // it can remove an object , if it already exists in the string
        // this method also checks if the removing was successful and returns boolean:
        // true ==> the removing was successful

        System.out.println("-----------------------------------------");


        //clear method


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // index 0
        numbers.add(20); // index 1
        numbers.add(30);// index 2
        numbers.add(40);
        numbers.add(50);



    boolean r1=numbers.remove(Integer.valueOf(20)); // to convert the primitive into Object

        numbers.clear(); // the arraylist will be completely cleared and the size will be set to 0
        System.out.println(numbers);
        System.out.println(numbers.size()); //0


        System.out.println("------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl")); // 0 ==> returns index number of an Object. will search the index number of 1st occured element
        System.out.println(names.lastIndexOf("Vasyl")); // 1 ==> returns the index number of last occurred element

        System.out.println(names.lastIndexOf("Sumeye")); //5


// contains method
boolean hasMuhtar = names.contains("Muhtar"); //false
boolean hasAli = names.contains("Ali"); // true


        System.out.println("--------------------------");

        // equals method -- compare if 2 array have the same elements in the same order


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1; // both lists are referencing to the same object

list1.add(10);
        System.out.println(list1); //10
        System.out.println(list2);//10
        System.out.println(list1==list2); //true

ArrayList<Integer> l1 = new ArrayList<>(); // two separate objects
ArrayList<Integer> l2 = new ArrayList<>();

l1.add(10);
l2.add(10);

        System.out.println(l1==l2); //false - two separate objects
        System.out.println(l1.equals(l2)); // true. they have the same elements in the same order


        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);


        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2)); // false -- different order of elements

        System.out.println(n1.isEmpty()); // false
        System.out.println(n2.isEmpty()); // false

        n1.clear();
        n2.clear();
        System.out.println(n1.isEmpty()); //true
        System.out.println(n2.isEmpty()); // true









    }



}
