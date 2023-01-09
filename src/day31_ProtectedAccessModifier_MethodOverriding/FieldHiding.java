package day31_ProtectedAccessModifier_MethodOverriding;

class A{ // parent class
    public int a =100;
}


public class FieldHiding extends A{
    public int a =300; // child class has the same variable as parent class,
    // that will make variable a hidden in a parent class, and it won't be inherited
    // to a child class. so the value of a will be 300

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a); // to print a we need to create a new object
    }
}
