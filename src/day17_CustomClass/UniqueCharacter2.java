package day17_CustomClass;
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"
				output:
					bd
 */
public class UniqueCharacter2 {
    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j <str.length() ; j++) {


            char ch = str.charAt(j); //
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { //checks how many times this character appeared in the string
                if (str.charAt(i) == ch) { // every time the ch appears in the string
                    frequency++;// the frequency will be increased by 1
                }
            }
            if (frequency == 1) { // if the frequency is 1, it means the ch appered only once, so it's unique
                unique += ch;
            }

        }
        System.out.println(unique);








    }















}
