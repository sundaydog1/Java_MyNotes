package day11_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "CYDEO SCHOOL";
        str1.toLowerCase(); // returns "cydeo school"
        System.out.println(str1); // it will still print uppercase as the previous method
                                  // doesn't change the given spring , but create a new object
        // to get the lower case we need to reassign str1 variable to the toLowerCase()

        str1 = str1.toLowerCase();
        System.out.println(str1); // prints in lower case now

        System.out.println("-------------------------------");

        String str2 = "java programming";
       String str3= str2.toUpperCase(); // second String object is created "JAVA PROGRAMMING"
        // now we have both lower and upper case versions store in str2 and str3

        System.out.println(str2);
        System.out.println(str3);

        System.out.println("-----------------------------------");

        String word = "Wooden Spoon";
        word=  word.toUpperCase();  // "WOODEN SPOON"
        word= word.toLowerCase(); //"wooden spoon"

        System.out.println(word); // it will print the last assigned value==> the lower case

        System.out.println("-------------------------------------------------");

        String str5 = "               Cydeo School"; // all the spaces will be reflected when printed
        str5.trim(); //this method "TRIM' excludes all the white (unused) spaces
        str5 = str5.trim();
        System.out.println(str5);


        System.out.println("--------------------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class today";
        int index1 = sentence1.indexOf('w');
        int index2 = sentence1.indexOf('a'); // it will show the index for the first matching character
                                                // from left to right

        System.out.println(index1);
        System.out.println(index2);


int secondA = sentence1.indexOf("ay,"); // we can add other characters to make it clear
                                        //what 'a' we are looking for. it calculates the index
                                        //  for the 1st character in ""

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        int a2 = s2.indexOf("a Python");
        int a3 = s2.indexOf("avaS");
        int a4 = s2.indexOf("aS");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

//-------------------------------------------------------

        String w = "java";
        System.out.println( w.indexOf('a')); // index for jAva ==> 1. from left to right
        System.out.println(w.lastIndexOf('a')); // index of javA ==>3  from right to left





    }







}
