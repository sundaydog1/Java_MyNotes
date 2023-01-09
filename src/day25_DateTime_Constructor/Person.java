package day25_DateTime_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public int age;
    public char  gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;
public String food;
public String drink;

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;

  //  public void eat(String food){
   //         System.out.println(name +" is eating "+food);
   //     }


    }
}
