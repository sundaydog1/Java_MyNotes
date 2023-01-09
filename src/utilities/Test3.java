package utilities;

import day31_ProtectedAccessModifier_MethodOverriding.ProtectedAccessModifier;

//inheritance  makes it possible to access protected instances and methods from a different package

public class Test3 extends ProtectedAccessModifier {
    public static void main(String[] args) {
        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();


    }
}
