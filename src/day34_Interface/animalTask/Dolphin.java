package day34_Interface.animalTask;

public class Dolphin extends Animal {
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Dolphin is drinking");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+ getName()+" is eating fish");
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin is sleeping");
    }
}
