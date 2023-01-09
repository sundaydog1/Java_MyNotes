package day19_Arrays_Intro;

import java.util.Arrays; // importing Arrays Class from java.util package

public class ArraysIntro {
    public static void main(String[] args) {

        int score1 = 85;  // only one data can be stored in a regular variable
        int score2 = 75;  // that's why we have to create 5 different
        int score3=78;
        int score4=93;
        int score5 = 81;

        // instead we can use an array to store all of these variables

        int[]scores = new int [5]; // contains 5 elements, no more, no less. their indexes will be :0,1,2,3,4
        // each element's value will be 0 by default unless the elements are assigned

        scores[2]=78; // assigning value to the 3rd element
        scores[0]=85;
        scores[1]=75;
        scores[3]= 93;
        scores[4]=81;


        System.out.println(Arrays.toString (scores) );  // to print Arrays object, as long it's 1-dimensional array
        System.out.println(scores[2]); // to print a scpecified element from the array


// to print out all the objects of array we can use loop
        for (int i = 0; i <5 ; i++) { // i: index numbers of scores elements
            System.out.println(scores[i]);
        }
        for (int i = 0; i <scores.length ; i++) {
            System.out.println(scores[i]);
        }

        // to print the last element of array
        System.out.println(scores[scores.length -1]);






    }







}
