package day17_CustomClass;
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"
				output:
					bd
 */
public class UniqueCharacters1 {
    public static void main(String[] args) {

        String str = "aabccd";
        String unique = "";
        for (int i = 0; i < str.length(); i++) { // i: index numbers of string
            char each = str.charAt(i);

            if (str.indexOf(each)==str.lastIndexOf(each)){
                unique+=each;
            }
        }
        System.out.println(unique);














    }












}
