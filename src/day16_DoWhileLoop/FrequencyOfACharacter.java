package day16_DoWhileLoop;

public class FrequencyOfACharacter {
    public static void main(String[] args) {
        String str = "ccacabbbcccc";
        char ch = 'c';
        int count = 0; // the number of  the given character in the string

        for (int i = 0; i <str.length() ; i++) { // i : index numbers of string
            if (str.charAt(i)==ch){ // if the character of the string is equal to the given character, it means the given character has appeared in the string
                count++; // then count will be increased by one each time
            }

        }
        System.out.println(count);


    }










}
