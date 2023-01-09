package day19_Arrays_Intro;

import java.util.Arrays;
public class Arrays_Practice {
    public static void main(String[] args) {

        String[] myGroup = new String [5];
        myGroup[0]= "Kate";
        myGroup[myGroup.length-1]="Thomas";
        myGroup[2]= "Greg";
        myGroup[1]="Lindsy";
        myGroup[3]="Laura";


        System.out.println(Arrays.toString(myGroup));

myGroup[1]="Kuzat"; // to update the element

        // to print the array elements in reversed order

        for (int i = myGroup.length-1; i>=0 ; i--) {
            System.out.println(myGroup[i]);

        }
        System.out.println("-------------------------------");

        // shortcut  for-loop with array ==> ArrayName.fori
        // shortcut for reversed for-loop with array ==> ArrayName.forr

        for (int i = 0; i < myGroup.length; i++) { // straight order

        }

        for (int i = myGroup.length - 1; i >= 0; i--) { // reversed order

        }












    }








}
