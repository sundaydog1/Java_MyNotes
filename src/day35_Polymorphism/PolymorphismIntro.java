package day35_Polymorphism;

import day34_Interface.animalTask.Cat;
import day34_Interface.animalTask.*;

public class PolymorphismIntro {
    public static void main(String[] args) {

 Dog dog=       new Dog("Max","Husky",'M',4,"Large","white");
Cat cat = new Cat("Mimi","Scottish",'F',2,"small","brown");

Tiger tiger=null;
Eagle eagle = null;


Animal[]animals={dog,cat,tiger,eagle};

Animal animal = cat;


    }
}
