package day34_Interface.animalTask;

public class Lion extends Animal{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Lion "+ getName()+" is drinking water");
    }

    @Override
    public void eat() {
        System.out.println("Lion "+ getName()+" is eating meat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion "+ getName()+" is sleeping");
    }
}
