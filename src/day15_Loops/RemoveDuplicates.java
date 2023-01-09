package day15_Loops;
/*
Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbbcccc";

String result = ""; //abc
        for (int i = 0; i <str.length() ; i++) { // i represent the index numbers of this string

            char each = str.charAt(i); // each character of the string

          /*so to solve this task, we want to be able to identify each character separately
          for that we use charAt method for i, where i represents the index number of each
          character. Then we gonna create an empty String result, to which we gonna add
          each character one by one with the condition, that the string doen't contain
           this character yet.
           Let's say ""+a ==> "a", "a" +a ==>"a" (the second "a" won't be
          added to the string , as it already contains this character), "a" + b ==>"ab" and so on
           */
            // does not contain    // we also need to concat char to a String because contains method accepts string only
            if (!result.contains("" + each)) { // if the string result doesn't contain the character of String str yet
                result += each; // we will add the character to String result
            }
        }
            System.out.println(result);













    }














}
