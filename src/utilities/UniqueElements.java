package utilities;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Snukir");
        names.add("Marika");
        names.add("Marika");

        /*
        if the index of first occured element is the same as the index of the last occured element
        it means that the element appeared only once in the array list

         */
        for (String each : names) {
            if (names.indexOf(each)== names.lastIndexOf(each))
                System.out.println(each);
        }






















    }





















}
