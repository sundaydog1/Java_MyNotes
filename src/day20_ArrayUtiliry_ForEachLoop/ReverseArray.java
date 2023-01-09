package day20_ArrayUtiliry_ForEachLoop;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5};
        int [] reverse= new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--, j++) { // i is index of the original array, and j represent indexes of the new (reversed) array. so while i is decreasing, j has to be increasing
         reverse[j]=   array[i]; // the first character of the reversed string will be the last character of the original string
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("-----------------------------");

        int[] nums = {100,200,300,400,500};
     nums =    ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("---------------------------------------");

        double [] a1 ={1.5,2.5,3.5,4.5,5.5};
a1 =ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a1));

        System.out.println("------------------------------");




    }






}
