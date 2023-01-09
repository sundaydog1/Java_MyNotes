package day31_ProtectedAccessModifier_MethodOverriding.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {
        Cat cat = new Cat("Emily","Bengle",'F',4,"Large","Grey",true);

        Dog dog = new Dog ("Max","Husky",'M',3,"Large","White");

        System.out.println(cat);

        System.out.println(dog);

        System.out.println("-----------------------------------------");

        cat.eat();
        dog.eat();
        cat.sleep();
        dog.sleep();

    }
}
