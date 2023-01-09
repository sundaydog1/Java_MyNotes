package day11_String;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "Java";
        boolean r1 = word.isEmpty(); // indicates if the String is empty ==> returns a boolean
        System.out.println(r1);

        System.out.println( "-----------------------------------------");

        String str = "         "; // contains spaces
        boolean r2 = str.isEmpty(); // => false , as it counts spaces too
        boolean r3 = str.isBlank();// => true  , no text/characters

        String l = "";
        boolean empty = l.isEmpty();
        boolean blank = l.isBlank();


        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("empty = " + empty);
        System.out.println("blank = " + blank);


        System.out.println("-----------------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        String str3 = "cydeo";
        System.out.println(str1.equals(str2)); //returns true or false => true
        System.out.println(str1.equals(str3)); //=> false . Java is case sensitive

        //-------------------------------------------------------
        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equalsIgnoreCase(s2));//=> true

        System.out.println("--------------------------------------------");
        String students = "Daniel Lucy Jacob Thomas Kathy";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println(hasAhmed); // false
        boolean haslucy = students.contains("lucy");
        System.out.println(haslucy); // false. as Java is case sensitive;

        System.out.println("--------------------------------------");

        String name ="Michael";
        boolean firstLetter = name.startsWith("Da"); //false
        System.out.println(firstLetter);

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");// true
        System.out.println(isValid);

        boolean t = url.endsWith(".com"); // true
        System.out.println("t");

        //-------------------------------------------
        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");

        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isGmail = " + isGmail);

        int x = 9;
        float y = x/2;
        System.out.println(y);
        












    }








}
