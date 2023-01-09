package day20_ArrayUtiliry_ForEachLoop;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70,100,80,90,65};

        System.out.println(Arrays.toString(score));
        String result = Arrays.toString(score);
        System.out.println(score);

        System.out.println("---------------------------");

        int []a1 ={1,2,3,4,5}; // to be true , the characters have to bethe same and in the same order
        int []a2 ={1,2,3,4,5};

        boolean equal = Arrays.equals (a1,a2); // true
        System.out.println(equal);


        char [] ch1 = {'A','B','C'};
        char[] ch2 = {'A','C','B'};
        equal = Arrays.equals(ch1,ch2); // false
        System.out.println(equal);

        System.out.println("------------------------------");

        int [] nums = {100,80,90,75,88,1,4,500};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); // will sort the array in ascending order
        System.out.println(Arrays.toString(nums));

        int minNum = nums[0]; // to get the minimum number of the Array ==> after sort method, it will be at index 0
        System.out.println(minNum);

int maxNum = nums[nums.length-1]; // to ge the max number of the Array ==> it will be at last index
        System.out.println("maxNum = " + maxNum);

        System.out.println("-----------------------------------------");

        String []students = {"Thomas","Taliyah","Alona","Meredith","Xavier","Ali"};
        Arrays.sort(students); // it will be sorted in alphabetic order

        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------------");

        int[] array = {10,20,30,40,50};
        int [] array2 = Arrays.copyOf(array,5) ;// all 5 elements from the original array will be copied
        int [] array3 = Arrays.copyOf(array,2); // only first 2 elements will be copied
        int [] array4 = Arrays.copyOf(array,8); // 3 zeros will be added


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));


        System.out.println("----------------------------------------------------");

      //  merging two arrays w/ a different approach:

        int []n1 ={1,2,3,4,5};
        int []n2 ={6,7,8,9,10,11,12};
        int [] n3 = Arrays.copyOf(n1,n1.length+n2.length);
                                                                    // j : elements of the 3rd array
        for (int i = 0, j = n1.length; i < n2.length; i++,j++) {  //i: elements of the second array
            n3[j] =n2[i];
        }
        System.out.println(Arrays.toString(n3));

        System.out.println("------------------------------------------");

        char []ch = {'A','B','C','D','E','F'};
        // index:     0   1   2   3   4   5

     char[] result2 =   Arrays.copyOfRange(ch,2,4);
        System.out.println(Arrays.toString(result2));

    }







}
