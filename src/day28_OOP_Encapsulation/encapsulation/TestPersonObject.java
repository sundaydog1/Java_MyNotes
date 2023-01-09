package day28_OOP_Encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {


        Person person1 = new Person(" Tom", 2, 'M', LocalDate.of(2028, 4, 2));

        System.out.println(person1);

    }
}