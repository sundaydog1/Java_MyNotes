package day24_ArrayList_Date_Time;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaabbbbccccc";
        String result ="";          // a3b4c5

        for (String each : str.split("")) { // we turned a string into an array of string
        int frequency =    Collections.frequency(Arrays.asList(str.split("")),each); // we can pass a String array as List

        if(!result.contains(each)){  // to avoid duplication
            result+=each+frequency;
        }

        }

        System.out.println(result);




    }
}
