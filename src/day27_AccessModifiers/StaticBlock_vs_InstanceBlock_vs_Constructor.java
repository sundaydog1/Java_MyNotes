package day27_AccessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor"); // takes arguments, we can set instance variables as we wish
    }                                   // will be executed every time we create an object

    {               // depends on object, will be executed every time we create an object
        System.out.println("Instance block");
    }

    static { // doesnt depend on object. can only be executed once
        System.out.println("Static block");
    }

    public static void main (String[] args){   // if we don't create an object only  static will be executed first and then Main Method
        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor(); // static block will be executed first, then main. then instance block
        // and constructor will be executed last
    }









}
