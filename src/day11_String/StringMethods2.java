package day11_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence = "I love Python, Python is the best programming language, and Python" +
                " is in high demand";
        sentence= sentence.replace("Python","Java");

        System.out.println(sentence);
//---------------------------------------------------------------------
        String word = "java";
        word = word.replace("a","e");
        System.out.println(word);
//---------------------------------------------------------------------

        String sentence2 = "I love Java, Java is cool";
       sentence2 = sentence2.replaceFirst("Java","Python"); //only 1st Java will be replaced
        System.out.println(sentence2);

        //----------------------------------------------
        String sentence3 = "Java is fun, Java is cool, Java is amazing"; // to replace only the 2nd Java, we need to make sure it specific and unique
      //  sentence3 = sentence3.replaceFirst(", Java","Python") // in this case the" , and space" before Python will be gone
        sentence3 = sentence3.replaceFirst(", Java", ", Python");
        System.out.println(sentence3);


        System.out.println("____________________________________________________");
        String sentence4 = "I love Java Programming"; // to get a new string "Java",
        // index number for "J" is 7 and"a" is 10
        // String languageName = sentence4.substring(7,10); // the last index will
        // be always excluded so the result will be ==>"Jav"
        String languageName = sentence4.substring(7,11);
        System.out.println(languageName);

        //---------------------------------------------------------------------
        // to get word "Sunday" out of string. Index of "S" = 9, index of "y" =14
        String sentence5 ="Today is Sunday, tomorrow is Monday";
        String today = sentence5.substring(9,14+1);
        System.out.println(today);

        //____________________________________________________________________

       // task : to find domain (email)
        String email = "CydeoSchoolJavaProgramming@gmail.com";
        int beginning = email.indexOf('@') + 1; // to fing the index of the first character in email
        int ending = email.lastIndexOf('.');
        String domain = email.substring(beginning,ending);
        System.out.println(domain);

//-------------------------------------------------------------------
        String sentence6 = "I love Java programming";
        String r1 = sentence6.substring(7); // it'll print starting from index 7 till the end of the String
        System.out.println(r1);

        //------------------------------------------
        String sentence7 = "Today is Sunday, tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+1);
        System.out.println(tomorrow);

        //------------------------------------------
        String sentence8 = "I study at Cydeo School";
        String schoolName = sentence8.substring(11);
        System.out.println(schoolName);

        System.out.println("----------------------------------------------------");

        String str = "Python";
        String result = str.repeat(10); // Python will be repeated 10 times
        System.out.println(result);
        String result2=(str +"\n").repeat(3);
        System.out.println(result2);

    }







}
