package day21_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {
    public static void main(String[] args) {

        int [] arr1D= new int [10];
        System.out.println(Arrays.toString(arr1D));

        int []arr1 ={1,2,3,4};


        int[][]arr2D=new int [5][]; // the length of the 2D array is stated in the 1st []
        // and indicates how many 1D array will be in it
        System.out.println(Arrays.deepToString(arr2D));

         arr2D[0]=arr1;








    }
}
