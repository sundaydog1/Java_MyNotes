package day23_ArrayListMethods_CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    int max= Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("--------------------------------------------------");

        // sort  - sorts elements in ascending order
    ArrayList<String> items = new ArrayList<>(Arrays.asList("Eggs","Milk","Potatoes","Tomatoes","Rice","Oranges","Strawberries","Paper towels"));
Collections.sort(items);
        System.out.println(items);

// reverse   - reverse elements from the end to beginning
Collections.reverse(items);
        System.out.println(items);

        System.out.println("----------------------------------------------");

        // swap  - doesn't change or replace elements ==> only changes indexes

        ArrayList<String> students = new ArrayList<>(Arrays.asList("Tatiana","Meredith","Chase","Leo"));

        System.out.println(students);

Collections.swap(students,0,1); // the order doesn't matter

        System.out.println(students);

        Collections.swap(students,0,students.size()-1);





    }
}
