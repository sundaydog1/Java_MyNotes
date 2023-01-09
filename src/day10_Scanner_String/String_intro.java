package day10_Scanner_String;

public class String_intro {
    public static void main(String[] args) {

        String str1 = "Cat"; //since str1 and str 3 are identical, only 1 object Cat wii be
        String str2 ="Dog";  // created in String Pool memory. So there are 3 strings, but only
        String str3 ="Cat"; // 2 objects in the memory : "Cat" and "Dog"

        System.out.println(str1==str3); // returns true. they are the same and identical


        String a1 = new String ("java"); // creates 2 objects : 1 in string pool and the other one
        String a2 = new String ("java"); //in heap (outside String Pool)

        System.out.println(a1==a2); // returns false, as they are 2 different objects


        String t1 = "Python";
        String t2 = new String("Python");
        System.out.println(t1==t2); // returns false. also not the same objects



    }






}
