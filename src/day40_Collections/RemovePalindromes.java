package day40_Collections;

import utilities.StringUtilities;

import java.util.*;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

Iterator<String> it = names.iterator();

while(it.hasNext()){ // as long as this condition is true
    String each = it.next(); // we can get each element of the string
String reverse = ""; // then we need to reverse each element

    for (int i = each.length()-1; i >=0 ; i--) { // starting from last element of the String to its first index

        reverse+=each.charAt(i); // each character at index i will be added to a reverse string
    }

if (each.equalsIgnoreCase(reverse)){ // if original string equals its reversed version
it.remove(); // then it's a palindrome and we need to remove it
}
}

        System.out.println(names);

        System.out.println("------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );


        names2.removeIf(p-> StringUtilities.reverse(p).equalsIgnoreCase(p));
        System.out.println(names2);

        System.out.println("------------------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        names3.removeIf(p-> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));
        System.out.println(names3);

    }
}
