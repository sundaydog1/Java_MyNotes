package day34_Interface.animalTask;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Cat "+ getName()+" is drinking milk");
    }

    @Override
    public void eat() {
        System.out.println("Cat "+ getName()+" is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+ getName()+" is sleeping 16 hours");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
