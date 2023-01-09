package day41_Maps;

import day33_Abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<List<Integer>>list = new ArrayList<>(); // list of list or nested list
        List < Queue<Integer>> list2 = new ArrayList<>(); // list of Queue
        List <int[]>list3 = new ArrayList<>(); // list of Array

        System.out.println("----------------------------------------------");

        List<Integer>list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer>list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(7,8,9,10,11));

        List<List<Integer>>lists = new ArrayList<>();
    //    lists.addAll(Arrays.asList(list4,list5)); // we can them both at once
    lists.add(list4);
    lists.add(list5);

        System.out.println(lists);

        // how to get 10: the 4th elemnt of second list
        System.out.println(lists.get(1).get(3)); // first we need to get the list and then an element in that list

for(List<Integer> eachList:lists){ // the 1st loop gets each list fromList of Lists
    for(Integer eachElement: eachList){ // the 2nd loop gets each element from each list
        System.out.println(eachElement);
    }
}

        System.out.println("---------------------------------------");

List <Set<Integer>> listOfSets = new ArrayList<>();
listOfSets.add(new LinkedHashSet<>()); //0
listOfSets.add(new LinkedHashSet<>()); //1
listOfSets.add(new LinkedHashSet<>()); //2
listOfSets.add(new LinkedHashSet<>()); //3

        System.out.println(listOfSets);

        listOfSets.get(0).addAll(Arrays.asList(10,5,20,10,5,20));
        listOfSets.get(1).addAll(Arrays.asList(30,15,30));
        listOfSets.get(2).addAll(Arrays.asList(300,150,40));
        listOfSets.get(3).addAll(Arrays.asList(30000,1,5));

        System.out.println(listOfSets);

        System.out.println("--------------------------------------------");

        int[] arr1 ={1,2,3,4};
        int[]arr2 = {5,6,7,8,9,10};

        List<int[]> listOfArrays = new ArrayList<>();
listOfArrays.add(arr1);
listOfArrays.add(arr2);

listOfArrays.get(0)[2]=35; // assign new value for the [3rd element] in (1st array)

        System.out.println(Arrays.toString(listOfArrays.get(0))); // to print the 1st array from the list


        System.out.println("----------------------------------------");

        List <List< Employee>> teams = new ArrayList<>(); // to store lists of Employees



    System.out.println("--------------------------------------");

        List<int[][]> l = new ArrayList<>(); // we can store only 2D arrays in this list


    }
}
