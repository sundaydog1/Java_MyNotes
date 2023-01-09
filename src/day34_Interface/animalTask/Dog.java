package day34_Interface.animalTask;

public class Dog extends Animal implements Playable {
    @Override
    public void drink() {
        System.out.println("Drinking water");
    }

    @Override
    public void eat() {
        System.out.println("Eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping 12 hours");
    }

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void play() {
        System.out.println("Dog "+getName()+" is playing");
    }
}
