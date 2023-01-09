package day19_Arrays_Intro;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {

        int[]numbers = new int[5]; // this is the only way to create am Array when we dont know what the elements are

        //when we know what the elements are:
        int[]nums ={1,2,3,4,5};

        System.out.println("--------------------------------------------");

        // element:         1           2       3           4           5       6           7
        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
       // index:            0           1       2           3           4       5           6

        int n = 1; // for ex. we want to print the first element. the 1st element has index 0
        System.out.println(days[n-1]); // n-1==> to find the index number of the element

        System.out.println("--------------------------------------------------------");

        String[]month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("month = " + Arrays.toString(month));

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }























    }
}
