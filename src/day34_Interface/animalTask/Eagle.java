package day34_Interface.animalTask;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void fly() {

    }

    @Override
    public void drink() {
        System.out.println("Eagle "+getName()+" is drinking water");
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating meat");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle "+getName()+" is sleeping");
    }
}
