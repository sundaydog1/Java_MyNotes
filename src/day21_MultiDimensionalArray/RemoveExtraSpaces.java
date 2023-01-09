package day21_MultiDimensionalArray;

import java.util.Arrays;

/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "
        	Output:
        		Hello world I love Java
 */
public class RemoveExtraSpaces {
    public static void main(String[] args) {
    String    str = "  Hello world      I      love      Java    "   ;
 //   str = str.trim(); // to remove spaces in the beginning and the end of the string
 //       System.out.println(str);
String [] words =str.split(" ");
        System.out.println(Arrays.toString(words));
str = "";
        for (String each : words) {
         if (!each.isEmpty()){
             str+=each+" ";
         }
        }
str = str.trim(); // after the loop we will have 1 extra space in the end. we can trim it to get rid of it
        System.out.println(str);








    }
}
