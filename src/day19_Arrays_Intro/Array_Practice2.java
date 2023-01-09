package day19_Arrays_Intro;
import java.util.Arrays;
public class Array_Practice2 {
    public static void main(String[] args) {
        
        int arr1[]=new int[100];

        System.out.println("Arrays.toString(arr1 = " + Arrays.toString(arr1));
        System.out.println("-------------------------------------------------");

// To get every number from 1 to 100
        // 1st method
    /*    for (int i = 0, j=1; i < arr1.length; i++,j++) { // we have to declare secondary variables in the loop
            arr1[i]=j;
        }
      */

        // 2nd method 
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=i+1;
        }

        System.out.println("arr1 = " +Arrays.toString(arr1) );
        System.out.println("-------------------------------------");
        
        int[]arr2 = new int[100]; // index 0~99
        for (int i = 0, j =100; i < arr2.length; i++,j--) {
           arr2[i]=j;    //while i is increasing from 0 to 99, j is decreasing from 100 to 1
        }
        // or another way to do it w/o secondary variable
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=100-i;
        }

        System.out.println("arr2 = " +Arrays.toString( arr2));
        

        
        
        
        
        
        
        
    }
}
