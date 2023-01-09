package day25_DateTime_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String job_title;
    public double salary;
    public LocalDate hire_date;


    // this constructor allows us to set up all the instance variables of the object
    // as soon as the object is created
    public Employee(String name, int age, char gender, String job_title,
                    double salary, LocalDate hire_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job_title = job_title;
        this.salary = salary;
        this.hire_date = hire_date;
    }

    // toString method allows us to to print the object when its passed in the print statement
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", job_title='" + job_title + '\'' +
                ", salary=" + salary +
                ", hire_date=" + hire_date.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }
}
