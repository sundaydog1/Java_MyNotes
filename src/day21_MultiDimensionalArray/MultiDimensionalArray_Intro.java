package day21_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray_Intro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int [] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};

        System.out.println("-------------------------------");

        //index:            0              1            2
        int[][]array2D={{10,20,30},{40,50,60,70,80},{90,100}};
        //index           0  1  2    0  1  2  3  4   0   1
        System.out.println(array2D.length); // the length of 2-dimensional array will be equal to number of one dimensional arrays int it


        System.out.println(Arrays.toString(array2D[2])); // {90,100}
        System.out.println(array2D[2][0]); // 90
        System.out.println(array2D[1][2]); //60



















    }
}
