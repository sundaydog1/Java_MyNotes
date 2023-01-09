package day23_ArrayListMethods_CollectionUtility;

import java.util.ArrayList;

import java.util.ArrayList;
public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(6);


        for (Integer element : list) {

int frequency =0;
            for (Integer each : list) {
                if (each==element) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(element);
                break; // to display only first unique element.
                // so as soon as this condition becomes true for the 1st time,
                // the break statement will exit the loop
            }

        }

    }
}
