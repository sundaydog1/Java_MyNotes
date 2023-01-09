package day19_Arrays_Intro;

import java.util.Arrays;

public class Array_Objects {
    public static void main(String[] args) {

        int[]arr1 = {10,20,30,40,50};
        int[]arr2=arr1;
        int[] arr3= arr2; // between these 3 lines only 1 object gonna be created in the heap

        arr1[0]=1000; // the first element will be changed in all 3 variables

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        System.out.println("------------------------------------");

        String [] a1 = {"Ahmed","Irina"}; // this object will be eligible for garbage collector
        a1= new String []{"James","Daniel"}; // this will be printed as it was reiniatilized
        System.out.println(Arrays.toString(a1));














    }
}
