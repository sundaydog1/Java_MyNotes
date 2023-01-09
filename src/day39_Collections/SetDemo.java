package day39_Collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(); // the fastest type of Set

        set1.addAll(Arrays.asList(10,200,300,40,90)); // order in hashset is random
        System.out.println(set1);

        set1.addAll(Arrays.asList(10,200,300)); /// duplicates are noe accepted
        System.out.println(set1);

        set1.add(null); // set accepts null
        System.out.println(set1);

        System.out.println("-----------------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();// preserves the insertion order
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300));// no duplicates will be accepted
        set2.add(null);// accepts null
        System.out.println(set2);

        System.out.println("-----------------------------------------------");

        Set<Integer> set3= new TreeSet<>();
        set3.addAll(Arrays.asList(10,200,300,40,90));// ascending order of elements
        set3.addAll(Arrays.asList(10,200,300)); // no duplicates are accepted
       // set3.add(null); // null pointer exception. null is not accepted in TreeSet
        System.out.println(set3);

        System.out.println("-----------------------------------");

        String[] words = {"Java","Java","Java","Python","C#","C+","C#"};

        // to exclude duplicates ,we can comvert arrayList into LinkedHashSet
        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));
        System.out.println(result);

        // to retrieve an element at a certain index from LinkedHashSet, we should convert it into ArrayList;
        System.out.println(new ArrayList<>(result).get(1));

        System.out.println("---------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));

        // to eliminate all duplicates and sort elements in ascending order
        Set<Integer> n = new TreeSet<>(numbers); // List to Set

        System.out.println(n);
    }
}
