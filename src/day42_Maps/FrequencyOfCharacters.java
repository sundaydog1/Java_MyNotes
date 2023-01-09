package day42_Maps;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/*
1. Write a program that can return the frequency of characters
            Not: MUST use map
                Ex: str = "bbcccaaaaa"
                output:
                    {b=2, c=3, a=5}
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "bbcccaaaaa";

        Map<String,Integer> map = new LinkedHashMap<>();

                            // to single out each character from the string
        for (String each : str.split("")) {
            int frequency= Collections.frequency(Arrays.asList(str.split("")),each);
            // the frequency method of Collections requires to pass a collection and then an element
            // so we need to turn array of characters into a List(Collection) by using Arrays.asList()

         map.put(each,frequency);

        }
        System.out.println(map);


    }
}
