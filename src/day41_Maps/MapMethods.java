package day41_Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
      Map<String,String> map = new TreeMap<>();
        System.out.println(map.size()); // ==> 0

        map.put("C02","Josh"); // adding a pair to map
        map.put ("B03","Nora");
        map.put ("D04","Tina");
        map.put ("B06","Alex");
        map.put ("A01","Tatiana");
        map.put ("A02","Tatiana");
        map.put ("A03","Tatiana");
        map.put ("A04","Tatiana");
        map.put ("A05","Tatiana");

        System.out.println(map.size()); // ==> 9 => returns total number of pairs
       
        System.out.println(map.get("A05"));// ==>"Tatiana"
        System.out.println(map.get("A09"));// ==> null  //since A09 key doesn't exist

        map.put("A04","Lucy"); // changing the key's value
        System.out.println("map = " + map);

        map.replace("C02","Jack"); // changes the value. faster than put method

        System.out.println("map = " + map);

        map.remove("A02"); // to remove a pair by key. the size will be decreased by 1

        System.out.println(map.containsKey("B03")); // ==> true
        System.out.println(map.containsKey("B01")); // ==> false

        System.out.println(map.containsValue("Lucy")); // true
        System.out.println(map.containsValue("Muhtar")); // false

      System.out.println(map.isEmpty());
      System.out.println(map.equals(map));

          map.clear(); // sets size to 0


    }
}
/*
pair: id - name
 */