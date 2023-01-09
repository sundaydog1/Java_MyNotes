package day29_Inheritance.animalTask;

public class Dog extends Animal{// Dog is Animal
    //      child       parent class

  /*  public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);
    }


    public void setInfo(String name, String breed, char gender, int age, String color, String size) {
        super.setInfo(name, breed, gender, age, color, size);
    }*/

    public void bark(){
        System.out.println(getName()+ " is barking");
    }




}
