package day22_ArrayList;

import java.util.ArrayList;
public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list); // 0 []
         list.add(10); // adds one element (int only) at a time. any element can be stored
        System.out.println(list); //[10]
         list.add(20); //[10,20]
         list.add(20); // accepts duplicates [10,20,20]
         list.add(30); //
        System.out.println(list); // [10,20,20,30]

     // all element in the list have index order, that they follow

        list.add(1,15); // adds element on a particular index. in this case 15 will be
        // placed at index 1. the number that was at index 1 previously will be shifted to the right => to index 2

        System.out.println(list); //[10,15,20,20,30]

        list.add(2,25);
        System.out.println(list); //[10,15,25,20,20,30]

        System.out.println("----------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Juan");
        studentsList.add("Kate");
        studentsList.add("Tatiana");
        studentsList.add("Alex");

        System.out.println(studentsList.size()); //==> 4 elements
        System.out.println(studentsList);

       String firstStudent= studentsList.get(0); // will give us the element at indicated index;
       String lastStudent= studentsList.get(studentsList.size()-1); // will return us the last students name

        System.out.println("lastStudent = " + lastStudent);
        System.out.println("firstStudent = " + firstStudent);

    }
}
