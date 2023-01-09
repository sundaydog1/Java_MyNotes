package day20_ArrayUtiliry_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;
import utilities.ArraysUtility;


/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}
	        output
	            arr3 = {1,2,3,4,5,6}
 */
public class Merge2Arrays {
    public static void main(String[] args) {
     int [] arr1 = {1,2,3,4};
      int [] arr2 = {5,6,7};

      int [] arr3 = new int [arr1.length+arr2.length]; // we need to make sure that a new array has enough capacity
                                                        // for both arrays
        
        int k = 0; // k represents indexes of 3rd array
        for (int i = 0; i < arr1.length; i++,k++) {
          arr3[k]=arr1[i]; // getting indexes of 1st array into the 3rd array;

        }

        for (int i = 0; i < arr2.length; i++,k++) { // i is for 2nd array's index numbers
         arr3[k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------------------");
        int [ ] a1 = {10,20,30,40,50,60};
        int [] a2 = {70,80,90};

        int [] a3= ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));


        System.out.println("---------------------------------");

        double [] b1 = { 10.5,5.3,6.0,8.5};
        double [ ] b2 = {20.1,15.0,0.8};
        double [] b3 = ArraysUtility.merge(b1,b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("----------------------------------------");

         char [] ch1 = {'a','b','c','d','e'};
         char [] ch2 = {'X','Y','Z'};
char [] ch3 =ArraysUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));


        System.out.println("--------------------------------");
String []c1 = {"java","Python","Ruby","javaScript"};
String [] c2 = {"C++","Swift"};
String [] c3=ArraysUtility.merge(c1,c2);
        System.out.println(Arrays.toString(c3));




    }












}
