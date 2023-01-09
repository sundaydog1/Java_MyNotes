package day17_CustomClass;

public class FrequencyOfCh {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";

        for (int j = 0; j <str.length() ; j++) { // making every character of str to go through the same process the inner loop creates


            char ch = str.charAt(j); // comparing the given character with every other character in str
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
if(result.contains(""+ch)){ // if the character isalreqdy included in the result
    continue; // skip that character ==> to avoid duplicates in the result
}
            System.out.println(ch + " : " + count);
        }
        System.out.println(result);


















    }


















}
