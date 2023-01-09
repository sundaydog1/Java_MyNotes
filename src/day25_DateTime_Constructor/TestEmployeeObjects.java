package day25_DateTime_Constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {


        Employee e1 = new Employee("Lucy", 26, 'F', "developer", 1400000, LocalDate.of(2020, 12, 2));


        System.out.println(e1);



    }
}