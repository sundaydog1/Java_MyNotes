package day29_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

Dog dog1 = new Dog();
        dog1.setInfo("Max","Husky",'M',4,"white","large");
Cat cat1 = new Cat();
cat1.setInfo("Kleo","siamese",'F',2,"grey","small");

Tiger tiger1 = new Tiger();
tiger1.setInfo("Sher Khan","Begal",'M',5,"Orange","large");

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(tiger1);


        System.out.println("--------------------------------------");
// the methods that are the same for the objects
        dog1.eat();
        dog1.sleep();
        cat1.drink();
        tiger1.sleep();
        cat1.eat();
        System.out.println("--------------------------------------------------");
// unique methods of each object
        dog1.bark();
cat1.meow();
tiger1.hunt();

dog1.setGender('F');
tiger1.setAge(8);

            System.out.println(dog1);
            System.out.println(tiger1);
    }
}
