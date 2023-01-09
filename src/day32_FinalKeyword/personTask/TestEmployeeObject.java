package day32_FinalKeyword.personTask;

import java.time.LocalDate;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Person person = new Person("Tatiana",'F', LocalDate.of(1995,04,18));

        System.out.println(person);
        person.breathe();

        System.out.println("------------------------------------");


        Employee empl = new Employee("Emily",'F',LocalDate.of(1987,05,28),"teacher",90000);

        empl.breathe();
    }
}
