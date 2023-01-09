package day41_Maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

            //key  //value
        Map<String,Integer>map = new HashMap<>(); // random order, accepts null key & null values

        map.put("Daniel",95000); // size:1
        map.put("Emily",100000);// size 2
        map.put("Bella",85000);  // size:3
        map.put("Aaron",78000);
        map.put("Chris",null);
        map.put("Breanna",null); // both will be accepted
        map.put(null,120000);
        map.put(null,110000);
        map.put(null,100000); // only the las one will be accepted

        //in order to update the value of the existing key
        map.put("Daniel",90000);


        System.out.println(map);

        System.out.println("-------------------------------------------");

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order preserved, accepts null key & null values
        linkedHashMap.put("Daniel",95000); // size:1
        linkedHashMap.put("Emily",100000);// size 2
        linkedHashMap.put("Bella",85000);  // size:3
        linkedHashMap.put("Aaron",78000);
        linkedHashMap.put("Chris",null);
        linkedHashMap.put("Breanna",null); // both will be accepted
        linkedHashMap.put(null,120000);
        linkedHashMap.put(null,110000);
        linkedHashMap.put(null,100000); // only the las one will be accepted

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("------------------------------------------");

        Map<String,Integer> treeMap = new TreeMap<>();// sorted by key (ascending)order, doesn't accept null key, but accepts null values

        treeMap.put("Daniel",95000); // size:1
        treeMap.put("Emily",100000);// size 2
        treeMap.put("Bella",85000);  // size:3
        treeMap.put("Aaron",78000);
        treeMap.put("Chris",null);
        treeMap.put("Breanna",null); // both will be accepted
     //   treeMap.put(null,120000); // ==>NullPointerException
    //    treeMap.put(null,110000);
    //    treeMap.put(null,100000); //

        System.out.println("treeMap = " + treeMap);

        System.out.println("---------------------------------------------------");


        Map<String,Integer> hashTable = new Hashtable<>();// random order, synchronized, doesn't accept null key or null values
        hashTable.put("Daniel",95000); // size:1
        hashTable.put("Emily",100000);// size 2
        hashTable.put("Bella",85000);  // size:3
        hashTable.put("Aaron",78000);
    //    hashTable.put("Chris",null); // ==>NullPointerException
    //    hashTable.put("Breanna",null);
    //    hashTable.put(null,120000); //==>NullPointerException
    //    hashTable.put(null,110000);
    //    hashTable.put(null,100000);

        System.out.println("hashTable = " + hashTable);

    }
}
