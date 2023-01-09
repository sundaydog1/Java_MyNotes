package day34_Interface.animalTask;

public class Duck extends Animal implements Playable,Flyable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void fly() {

    }

    @Override
    public void play() {

    }

    @Override
    public void drink() {
        System.out.println("Duck "+getName()+" is drinking water");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating seeds and worms");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is slepping");
    }
}
