package day43_ExtraTopics.generics;

import java.util.List;

public class GenericTypes <T> {

    // if we declare <T> in class name, we don't have to declare generic types in each of the methods
// we can't use static methods anymore, as <T> in this case will be an instance of an object
// since these methods won't be static anymore, we won't be able to call them from class name,
// we will need to create an object first , so they can be called through the object


    public void printEach(T[] array) { //it can be any name in<> but it's recommended to give 1 letter name in Upper case

        for (T each : array) {
            System.out.println(each);
        }

    }

    public void printEach(List<T> list) {
        for (T each : list) {
            System.out.println(each);
        }


    }
}