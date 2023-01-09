package day24_ArrayList_Date_Time;

import day17_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer
            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};
            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */
public class RemoveElementsFromCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));


list.removeIf(p ->  p<4);
        System.out.println(list);

        System.out.println("------------------------------------------");

ArrayList<String> names = new ArrayList<>();
names.addAll(Arrays.asList("Java","Python","C#","Java","Ruby","Java","C"));

names.removeIf(each->each.startsWith("J"));
        System.out.println(names);

        System.out.println("===============================================");


        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", "A01", 100000);
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", "A02", 90000);
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", "A03", 130000);
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", "A04", 95000);
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", "A05", 105000);



employees.removeIf(p->p.salary>100000);
        for (Employee each : employees) {
            System.out.println(each.name+" : "+ each.salary);
        }









    }
}
