package day28_OOP_Encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public String getName() {
        if(name==null){
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()|| name.isBlank()|| name==null){
            System.err.println("Name can not be empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0|| age>120){
            System.err.println("Invalid age: "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M'|| gender=='F')){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Invalid date of birth. Can not be after "+ LocalDate.now() );
     System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }


    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth()  +
                '}';
    }
}
