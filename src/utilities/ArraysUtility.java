package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0; // k represents indexes of 3rd array
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i]; // getting indexes of 1st array into the 3rd array;

        }

        for (int i = 0; i < arr2.length; i++, k++) { // i is for 2nd array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int k = 0; // k represents indexes of 3rd array
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i]; // getting indexes of 1st array into the 3rd array;

        }

        for (int i = 0; i < arr2.length; i++, k++) { // i is for 2nd array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;

    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int k = 0; // k represents indexes of 3rd array
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i]; // getting indexes of 1st array into the 3rd array;

        }

        for (int i = 0; i < arr2.length; i++, k++) { // i is for 2nd array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int k = 0; // k represents indexes of 3rd array
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i]; // getting indexes of 1st array into the 3rd array;

        }

        for (int i = 0; i < arr2.length; i++, k++) { // i is for 2nd array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }
    
    public static int[] reverse(int[]array){
        int [] reverse= new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--, j++) { // i is index of the original array, and j represent indexes of the new (reversed) array. so while i is decreasing, j has to be increasing
            reverse[j]=   array[i]; // the first character of the reversed string will be the last character of the original string
        }
        return reverse;
    }

    public static double[] reverse(double[]array){
        double [] reverse= new double[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--, j++) { // i is index of the original array, and j represent indexes of the new (reversed) array. so while i is decreasing, j has to be increasing
            reverse[j]=   array[i]; // the first character of the reversed string will be the last character of the original string
        }
        return reverse;
    }

    public static char[] reverse(char[]array){
        char [] reverse= new char[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--, j++) { // i is index of the original array, and j represent indexes of the new (reversed) array. so while i is decreasing, j has to be increasing
            reverse[j]=   array[i]; // the first character of the reversed string will be the last character of the original string
        }
        return reverse;
    }
    public static String[] reverse(String[]array){
        String [] reverse= new String[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--, j++) { // i is index of the original array, and j represent indexes of the new (reversed) array. so while i is decreasing, j has to be increasing
            reverse[j]=   array[i]; // the first character of the reversed string will be the last character of the original string
        }
        return reverse;
    }
    
    public static int[] addElement (int[]array, int element){
        int [] new_array = Arrays.copyOf(array,array.length+1); // we will copy the old array in to the new one
        new_array[new_array.length-1] = element; //to the last index of the new array we will assign the element we want to add
    return new_array;
    }

    public static double[] addElement (double[]array, double element){
        double [] new_array = Arrays.copyOf(array,array.length+1); // we will copy the old array in to the new one
        new_array[new_array.length-1] = element; //to the last index of the new array we will assign the element we want to add
        return new_array;
    }

    public static char[] addElement (char[]array, char element){
        char [] new_array = Arrays.copyOf(array,array.length+1); // we will copy the old array in to the new one
        new_array[new_array.length-1] = element; //to the last index of the new array we will assign the element we want to add
        return new_array;
    }

    public static String[] addElement (String[]array, String element){
        String [] new_array = Arrays.copyOf(array,array.length+1); // we will copy the old array in to the new one
        new_array[new_array.length-1] = element; //to the last index of the new array we will assign the element we want to add
        return new_array;
    }
    
   public static boolean contains (int [] array, int element){
       for (int each : array) {
           if(each==element){
              return true;
           }
       }
       return false;
    }
    public static boolean contains (double [] array, double element){
        for (double each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains (char [] array, char element){
        for (char each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains (String [] array, String element){
        for (String each : array) {
            if(each.equals(element)){
                return true;
            }
        }
        return false;
    }



    // remove
    // removeDup
    
    
    
    
    
    
    
}