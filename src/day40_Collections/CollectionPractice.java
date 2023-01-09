package day40_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CollectionPractice {
    public static void main(String[] args) {

Collection<Integer> collection = new ArrayList<>();
collection.add(100);
collection.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700));

        System.out.println(collection);

        System.out.println(((ArrayList) collection).get(2)); // we need to downcast it first,
        // before using get method

        System.out.println("-----------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700));
        System.out.println(collection2);

        System.out.println("-------------------------------");
        System.out.println(new ArrayList<>(collection2).get(4));



    }
}
