package day20_ArrayUtiliry_ForEachLoop;

import java.util.Arrays;

public class ForEachLoop_Practice {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};
        for (int each : numbers) { // each - is each element of the loop
            if(each%2!=0){
                System.out.println(each);
            }
        }
        System.out.println("-----------------------------");

        int [] nums = {100,20,5,1,1000,70,500};

        int max = nums[0];
int min = nums[0];

        for (int each : nums) {
            if(each>max){
                max = each;
            }
            if (each <min){
                min = max;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-----------------------------------------------");

        int [] a1 = {10,20,30};
        int [] a2 = {40,50,60,70,80,90,100};

        int [] a3 = new int[a1.length + a2.length];

        int k = 0;
        for (int each : a1) { // each - each element of the 1st array , have to be assigned to 3rd array
            a3[k++]=each; // assign elements of 1st array to the 3rd
        }
        for (int each : a2) {
            a3[k++]=each; // assign elements of 2nd loop to the 3rd
        }
        System.out.println(Arrays.toString(a3));

        System.out.println("--------------------------------------");
        String [] names ={"Tatiana Kuvshynova", "Eli Pearson","Roxolana Thompson","Michael Roike"};

        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));
        }













    }
}
