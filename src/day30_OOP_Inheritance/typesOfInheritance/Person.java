package day30_OOP_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;

    public Person(String name, char gender, LocalDate DOB) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        setAge(LocalDate.now().getYear()-DOB.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age can't be negative");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

   public void eat(String food){
       System.out.println(name+" is eating "+ food);
   }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }
}
