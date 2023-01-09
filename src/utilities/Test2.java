package utilities;

import day27_AccessModifiers.AccessModifiers;

import static day27_AccessModifiers.Data.d;
import static day27_AccessModifiers.Data.method4;
import static day27_AccessModifiers.Data.*; // wild import ==> imports all sattic variables and methods from the class

public class Test2 {
    public static void main(String[] args) {


        System.out.println(d); // if we imported the variable we don't need
        // to call it through the class, we can access it directly

method4(); // since it's imported, we have access to it directly

        System.out.println("--------------------------------------------");


        System.out.println(AccessModifiers.publicDate); // public is available in different package

        //     System.out.println(AccessModifiers.protectedData); // protected is not always accessible in different packages

        //     System.out.println(AccessModifiers.defaultDate);  // default is never accessible in a different package



    }
}
