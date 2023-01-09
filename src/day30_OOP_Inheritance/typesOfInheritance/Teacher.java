package day30_OOP_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee {
    public void teach(){
        System.out.println(getName()+ " is teaching");
    }

    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeID, double salary) {
        super(name, gender, DOB, jobTitle, employeeID, salary);
    }
}
