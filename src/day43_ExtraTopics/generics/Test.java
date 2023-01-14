package day43_ExtraTopics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Integer [] numbers = {10,20,30,40,50};
        Character [] characters={'A','B','C'};
        String [] strings = {"Java","Python","SQL","WoodenSpoon"};


        Generics.printEach(numbers); // since the method was declared as static , we can call it through class name
Generics.printEach(strings);

        System.out.println("-------------------------------------");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30));
        Generics.printEach(list);

        System.out.println("-------------------------------------");

        GenericTypes<Integer> obj = new GenericTypes<>();
        obj.printEach(numbers);


    }
}
