package day38_Exceptions;

public class Person {
    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
       setAge(age);
        if(!(gender=='M'||gender=='F')){ // if the gender is invalid
            throw new RuntimeException("Invalid gender"); // throws runtime exception and crushes the program
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age==0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if (age<0|| age>150){
            throw new RuntimeException("The age can not be negative or greater than 150");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
