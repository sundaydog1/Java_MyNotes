package day27_AccessModifiers;

public class StaticBlock {

    static{   // will be executed first , even before main method. Gets executed only once
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }





}
