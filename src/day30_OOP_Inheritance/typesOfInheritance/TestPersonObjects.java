package day30_OOP_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {


        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5, 16), 'A', "A01285");
        President president = new President("Daniel", 'M', LocalDate.of(1980, 12, 1), LocalDate.of(2019, 04, 20));
        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1994, 8, 28), "Math Teacher", "EE89252", 70000);


        student.eat("soup");
teacher.eat("burger");
president.lie();
student.study();
teacher.teach();


    }
}
