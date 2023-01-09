package day21_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

    // index of elements:   0  1  2    0  1  2  3  4    0   1
           int[][]array2D={{10,20,30},{40,50,60,70,80},{90,100}};
     // index of 1D Array :   0               1           2

        for (int i = 0; i < array2D.length; i++) { // i: index of 1D array in array2D
            int [] each1D = array2D[i];
            System.out.println(Arrays.toString(array2D[i]));

            for (int j = 0; j <each1D.length ; j++) { // j: index number of elements in each 1D array of array2D
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }

        }

        System.out.println("--------------------------------------------");

        // using for each loop

        for( int[] each1dArray :array2D){
            System.out.println(Arrays.toString(each1dArray));

            for(int eachElement:each1dArray){
                System.out.println(eachElement);
            }

        }

        System.out.println("-------------------------------------------");

        for (int i = array2D.length - 1; i >= 0; i--) { // forr - reversed order
            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.println(array2D[i][j]);
            }

        }

        for (int[] each1DArray : array2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }

        }









    }
}
