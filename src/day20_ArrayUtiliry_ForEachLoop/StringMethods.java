package day20_ArrayUtiliry_ForEachLoop;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str ="Cydeo School";

       char[] ch= str.toCharArray(); // each character of the string will be turned into separate index

        char[]ch1 = str.replace (" ","").toCharArray(); // if we would like to exclude the spaces in the string, so they won't be included in the new array

        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));

        System.out.println("-------------------------------");

        String str2= "Today is a great day to learn Java";

String[] words = str2.split(" "); // every word of a string will become an element in Array
                                        // has to be splitted by string that exists in the original spring

        System.out.println(Arrays.toString(words));
        System.out.println("===============================================");

        String sentence = "I Love Java";
   String[] arr=   ArraysUtility.reverse( sentence.split(" ")); // I, love, Java => Java, Love, I

        System.out.println(Arrays.toString(arr));

     String reversedSentence="";
        for (int i = 0; i < arr.length; i++) {
            reversedSentence+=arr[i]+" ";
        }
        System.out.println(reversedSentence);






    }













}
