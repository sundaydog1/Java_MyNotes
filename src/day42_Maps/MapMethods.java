package day42_Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();


        map.put("C02","Josh");
        map.put ("B03","Nora");
        map.put ("D04","Tina");
        map.put ("B06","Alex");
        map.put ("A01","Tatiana");


Map<String,String> employees = new TreeMap<>();
employees.putAll(map); // to add pairs from existing map into a new map

        System.out.println(employees);

        System.out.println(map.equals(employees)); // ==> true




    }
}
