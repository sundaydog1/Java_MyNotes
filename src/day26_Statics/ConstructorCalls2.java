package day26_Statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default");
    }

    public ConstructorCalls2(int a) {
        this();    // constructor call must be ath the 1st step at all times  // calls default constructor
   //     this("A"); -- wrong. -->constructor can call only 1 constructor
        System.out.println("int arg");
    }

public ConstructorCalls2(String a) {
     //   this ("A");  -- wrong --> constructor can not contain itself
    this(10); // calls the instructor with int arg
    System.out.println("String arg");

}

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2(); // default constructor will get executed

        System.out.println("--------------------------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10); // the 2nd constructor calls default constructor
        // so default constructor will be executed first and then int constructor gets executed

        System.out.println("----------------------------------------------");

ConstructorCalls2 obj3 = new ConstructorCalls2("Java");// contains the constructor with int arg, which contains
// the default constructor===> so all 3 constructors will be executed with creating this object



    }

}
