package day18_garbageCollection;


//It's possible to create a few classes inside one file( JavaClass), but only one of them can be public.
// And the one that is public has to have the same name that JavaClass has ( in this example
// it's MemoryAllocation Class). Creating a few classes in one Java Class IS NOT RECOMMENDED!
// and all classes should be created in separated files



class Car {
public String brand,model,color ;

}





public class MemoryAllocation {
    public static void main(String[] args) { // stack memory
        int a = 100; // local variable=> primitive value(not an Object=> stack memory
    }
        public static void method1(){ // stack memory
          int b = 200;   // local variable => primitive value => stack memory
        }

         public static void method2(){ // stack memory
            String c = "Hello World"; // local variable => reference variable (refers to an Object)
            //  stack       heap (String Pool)

        String d = new String ("Hello World");
        // stack     heap

        }






    }






