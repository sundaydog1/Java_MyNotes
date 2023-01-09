package day16_DoWhileLoop;

/*
write a program that can return the frequency of the word java from a sentence

Ex:
sentence =" java Java jaVa JAva"
output: 4
 */
public class FrequencyOfWord {
    public static void main(String[] args) {
      String  sentence =" java Java jaVa JAva";
      String word = "Java";
sentence = sentence.toLowerCase();
word = word.toLowerCase();
      int count = 0;
      while (sentence.contains(word)){
          count++;
    sentence=  sentence.replaceFirst(word,""); // every time the loop
          // gets executed the given word("Java") will be replaced with an empty string
          // and this while loop will only stop when there is no more"Java" in the sentence


      }
        System.out.println(count);







    }








}
