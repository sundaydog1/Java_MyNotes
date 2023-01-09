package day16_DoWhileLoop;

public class NestedLoop_Practice {
    public static void main(String[] args) {
    // find what charachters appered twice in the string (b,d,f)
        String str = "aaabbcccccccddeeeff";
        String result = "";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j); //ch is each character of String
            int count = 0; // count represents the frequency
            for (int i = 0; i < str.length(); i++) { //responsible for comparing ch to each character of str and returns frequency of ch
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
if (count==2 && !result.contains(""+ch)){
    result+=ch;
}
        }
        System.out.println(result);



    }



}
