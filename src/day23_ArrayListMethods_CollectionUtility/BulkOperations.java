package day23_ArrayListMethods_CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {


        // addAll method

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);


        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

numbers.addAll(list1);
        System.out.println(numbers); // list will be added after elements of Array Numbers

        numbers.addAll(4,list1); // list will be added at index 4
        System.out.println(numbers);

        System.out.println("------------------------");

ArrayList<Integer> scores = new ArrayList<>();

scores.addAll(Arrays.asList(75,91,82,70)); // takes array of elements and convert it to List
        System.out.println(scores);

        System.out.println("---------------------------------------");

ArrayList<String> students =new ArrayList<>();
students.addAll(Arrays.asList("Tatiana","Meredith","Chase","Leo"));

        System.out.println(students);

students.addAll(2,Arrays.asList("Jose","Sarah","Gabriel"));

        System.out.println(students);

        System.out.println("--------------------------------------------");

        Integer [] nums = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
  //      l1.addAll(Arrays.asList(nums));
        System.out.println(l1);

        ArrayList<String> employyesList = new ArrayList<>();
        employyesList.addAll(Arrays.asList("Alena","Muhtar","Ali","Mickey"));

        System.out.println(employyesList);

boolean hasAlena = employyesList.contains("Alena");
        System.out.println(hasAlena);

boolean hasAlenaMickey = employyesList.containsAll(Arrays.asList("Alena","Mickey")); // the order of elements doesnt matter

boolean hasMuhtarAliKuzat = employyesList.containsAll(Arrays.asList("Muhtar","Ali","Kuzat"));

        System.out.println("hasAlenaMickey = " + hasAlenaMickey);
        System.out.println("hasMuhtarAliKuzat = " + hasMuhtarAliKuzat);

        System.out.println("---------------------------------------------");

ArrayList<Integer>list = new ArrayList<>();
list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20,20));

list.removeAll(Arrays.asList(10,20)); // all 10 and 20 will be removed
        System.out.println(list);

        System.out.println("-------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Ali","Mickey", "Tatiana","Sam","Muhtar"));
        developers.retainAll(Arrays.asList("Alena","Sam","Muhtar"));
        System.out.println(developers);

        System.out.println("---------------------------------------");

ArrayList<String> groceries = new ArrayList<>();
groceries.addAll(Arrays.asList("Eggs","Milk","Potatoes","Tomatoes","Rice","Oranges","Strawberries","Paper towels"));

groceries.retainAll(Arrays.asList("Eggs","Potatoes","Milk"));
        System.out.println(groceries);












    }
}
