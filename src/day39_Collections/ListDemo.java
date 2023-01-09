package day39_Collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {


        List <Integer> arrayList = new ArrayList<>(); // Array base Class ==> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);


        List<Integer> linkedList = new LinkedList<>(); //Node based Class(Doubly Linked List==>
        // add(), addAll(),remove(),removeAll(),removeIf(), retainAll()  are faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("----------------------------------------");

Vector<Integer>vector = new Vector<>(); // synchronized version of arrayList

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.remove(0);

        vector.get(0);

        System.out.println("----------------------------------------");

Stack <Integer> stack = new Stack<>();

stack.add(100);
stack.add(200);
stack.add(300);

//stack.remove(0);

stack.get(0);

        System.out.println(stack);

        int lastElement = stack.pop(); // removes last added element
        System.out.println(stack);

        int secondLastElement = stack.pop();
        System.out.println(secondLastElement);
        System.out.println(stack);

    }

}
