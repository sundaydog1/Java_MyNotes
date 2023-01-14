package day43_ExtraTopics;

public class String_vs_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {

        String string = "Wooden";
        string.concat("Spoon"); // the object won't be changed as string is ummutable

        System.out.println(string); //==>"Wooden"

        // we need to either initialize it again or create a new object
string = string.concat(" Spoon");
        System.out.println(string); //==>Wooden Spoon

        System.out.println("-------------------------------------------");

        StringBuilder stringBuilder= new StringBuilder("Wooden");
        stringBuilder.append(" Spoon");
        System.out.println(stringBuilder);
stringBuilder.delete(0,3);
        System.out.println(stringBuilder);
        stringBuilder.substring(0,3);
        System.out.println(stringBuilder);

        System.out.println("-------------------------------------------");

       StringBuffer stringBuffer = new StringBuffer("Java Java");
       stringBuffer.insert(5,"Python ");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

    }
}
