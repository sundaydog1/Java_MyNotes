package day27_AccessModifiers;

import day27_AccessModifiers.Data;
public class Test {
    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);


Data.methid3();
Data.method4();

Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

    }
}
