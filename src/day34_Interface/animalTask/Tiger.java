package day34_Interface.animalTask;

public class Tiger extends Animal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println("Tiger "+ getName()+" is drinking water");
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+ getName()+" is eating meat");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger "+ getName()+" is sleeping");
    }
}
