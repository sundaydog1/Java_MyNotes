package day42_Maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";
	            output:
	                    {b=1, d=1, f=1}
 */
public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<Character,Integer> map = new LinkedHashMap<>();

for (String each: str.split("")){
    int frequency = Collections.frequency(Arrays.asList(str.split("")),each);
    if(frequency==1)
        map.put(each.charAt(0),frequency); // to convert string to char
}
        System.out.println(map);


    }
}
