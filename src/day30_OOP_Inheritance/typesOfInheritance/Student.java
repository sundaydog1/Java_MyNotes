package day30_OOP_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person{
    private char garde;
    private String studentID;

    public Student(String name, char gender, LocalDate DOB, char garde, String studentID) {
        super(name, gender, DOB);
       setGarde(garde);
  setStudentID(studentID);
    }

    public char getGarde() {
        return garde;
    }

    public void setGarde(char garde) {
        this.garde = garde;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName()+ " is studying");
    }
}
