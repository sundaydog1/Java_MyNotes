package day17_CustomClass;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String job_title;
    public String id;
    public double salary;



    // to create setInfo by using a short cut:
    /*
    1. right click
    2.generate
    3.constructor
    4. Ctrl+A - to select all option
    5.Enter
     */

    // this method sets all attributes of the employee at once
    public void setInfo(String name, int age, char gender, String job_title, String id, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job_title = job_title;
        this.id = id;
        this.salary = salary;
    }

    // to avoid hashcode when we print the object
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", job_title='" + job_title + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println(name+ " is working");
    }





}

