package day43_ExtraTopics.generics;

import java.util.List;

public class Generics {

  /*
    public static void printEach (Integer[] array){
        for (Integer each : array){
            System.out.println(each);
        }
    }

    public static void printEach (Character[] array) {
        for (Character each : array) {
            System.out.println(each);
        }
    }

    public static void printEach (String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

   */

public static <T> void printEach(T[] array){ //it can be any name in<> but it's recommended to give 1 letter name in Upper case

for (T each: array){
    System.out.println(each);
}

}

    public static <T> void printEach(List<T> list) {
    for (T each : list){
        System.out.println(each);
    }

    }


    
}
