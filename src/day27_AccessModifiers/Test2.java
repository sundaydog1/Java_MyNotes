package day27_AccessModifiers;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("---------------------------------------------");

        System.out.println(AccessModifiers.publicDate); // public is availabale withing the same package
        System.out.println(AccessModifiers.protectedDate);//protected is available within the same package
        System.out.println(AccessModifiers.defaultDate); // default is available within the same package


    }
}
