package day21_MultiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int element = 6;

     //   int[] new_array = new int [array.length+1]; // the length of the new array has to be big enough to include the old array and the new element
        // {1,2,3,4,5,6}
      int [] new_array = Arrays.copyOf(array,array.length+1); // we will copy the old array in to the new one
      new_array[new_array.length-1] = element; //to the last index of the new array we will assign the element we want to add



        System.out.println(Arrays.toString(new_array));

        System.out.println("=================================================");

        int[]numbers ={100,90,80,70,60};
      numbers=  ArraysUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------------");

       String [] names = {"Tati","Ana","Mari"};
      names = ArraysUtility.addElement(names,"Anna");
        System.out.println(Arrays.toString(names));
        names = ArraysUtility.addElement(names,"Sophie");
        System.out.println(Arrays.toString(names));




    }
}
