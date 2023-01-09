package day32_FinalKeyword.personTask;

import java.time.LocalDate;

public class Person {
    private String name;
    private final char gender; // setter won't be created for this variable, it doesn't affect getters
    private int age;
    private final LocalDate dateOfBirth; // you can never generate setter for a final instance variable

    public Person(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        if(!(gender=='M'|| gender=='F')){ // since there is no setter we need to include conditions in the constructor
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
        if(age<=0){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear()-dateOfBirth.getYear();
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final int numberOfHeads;
    static{
        numberOfHeads =4;
    }

    public void eat (){
        System.out.println(name+ " is eating");
    }
    public void drink (){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public final void breathe (){
        System.out.println(name+" is breathing"); // it's final to make sure this method won't be changed
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
