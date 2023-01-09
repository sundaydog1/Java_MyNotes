package day35_Polymorphism;

import day33_Abstraction.employeeTask.*;

import java.util.ArrayList;

/*
Print the name and Job Title of every employee
        2. How many developers do we have?
        3. How many testers do we have?
        4. How many teachers do we have?
        5. How many Drivers do we have?
        6. Display the names of employees who are not developers
 */
public class PolymorphismPractice2 {
    public static void main(String[] args) {


        Employee[] workers = {
                new Tester("Hamza", 32, 'M', "A01", 110000, "QA"),
                new Developer("Lucy", 27, 'F', "A02", 128000, "Java Developer", "Java"),
                new Tester("George", 28, 'M', "A03", 120000, "SDET"),
                new Developer("Yulia", 23, 'F', "A04", 135000, "Software developer", "Python"),
                new Tester("Cihad", 30, 'M', "A05", 100000, "SDET"),
                new Developer("Gulistan", 26, 'F', "A06", 130000, "Developer", "Python"),
                new Tester("Nora", 28, 'F', "A07", 120000, "QE"),
                new Driver("Aaron", 48, 'M', "D1", 90000, "Truck Driver"),
                new Developer("Diana", 29, 'F', "A08", 140000, "Front-end Developer", "C#"),
                new Tester("Tatiana", 25, 'F', "A09", 130000, "SDET"),
                new Developer("Alena", 26, 'F', "A10", 150000, "Back-end Developer", "Java"),
                new Tester("Timur", 29, 'M', "A11", 115000, "SDET"),
                new Teacher("James", 45, 'M', "B1", 75000, "Math Teacher")
        };

        for (Employee each : workers) {
            System.out.println(each.getName() + " : " + each.getJob_title());
        }


        System.out.println("-------------------------------------------");

        int countDeveloper=0,
                countTester=0,
                countDrivers=0,
                countTeachers=0;

        for (Employee each : workers) {
            if(each instanceof Developer){ // if employee is Developer
                countDeveloper++;
            }else if(each instanceof Tester){
                countTester++;
            }else if (each instanceof Teacher){
                countTeachers++;
            }else{
                countDrivers++;
            }
        }

        System.out.println(countDeveloper);
        System.out.println(countTester);
        System.out.println(countTeachers);
        System.out.println(countDrivers);

        System.out.println("------------------------------");

        for(Employee each:workers){
            if (!(each instanceof Developer)) {// if an object is NOT Developer
                System.out.println(each.getName());
            }
        }


    }
}
