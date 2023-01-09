package day34_Interface.animalTask;

public class Shark extends Animal {
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Shark is drinking");
    }

    @Override
    public void eat() {
        System.out.println("Srark "+ getName()+" is eating fish");
    }

    @Override
    public void sleep() {
        System.out.println("Shark is sleeping");
    }
}
