package day42_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order preserved, accepts null key & null values
        linkedHashMap.put("Daniel",95000);
        linkedHashMap.put("Emily",100000);
        linkedHashMap.put("Bella",85000);
        linkedHashMap.put("Aaron",78000);
        linkedHashMap.put("Chris",78000);
        linkedHashMap.put("Breanna",110000);

// iterating the map by the keys

        for(String eachKey: linkedHashMap.keySet()){
            System.out.println(eachKey);
            linkedHashMap.replace(eachKey,linkedHashMap.get(eachKey)*2); // to increase each employee's salary

        }
        System.out.println("----------------------------------------");

        // iterating map by values

        for (Integer eachValue : linkedHashMap.values()) {
            System.out.println(eachValue);

        }
        System.out.println("------------------------------------------");

       // iterating map by entries

        for (Map.Entry<String, Integer> eachEntry : linkedHashMap.entrySet()) {
            System.out.println(eachEntry);
        }

        System.out.println("---------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : linkedHashMap.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            System.out.println(eachKey+" : "+eachValue);
            eachEntry.setValue(eachValue+100);
        }
    }
}
