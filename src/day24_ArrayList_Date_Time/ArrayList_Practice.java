package day24_ArrayList_Date_Time;

import day17_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;
/*
Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));
	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");
	        Note: Employee class is imported from day17 package
	        1.1 Write a program that can display the name and job title of each employee
	        1.2 Write a program that can display the names of "Java Developers"
	        1.3 Write a program that can display the maximum and minimum salary
	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male employees to the femaleEmployees and maleEmployees arraylists
 */

public class ArrayList_Practice {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", "A01", 100000);
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", "A02", 90000);
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", "A03", 130000);
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", "A04", 95000);
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", "A05", 105000);


for (Employee each: employees){
    System.out.println(each.name+" : "+each.job_title);
}

        System.out.println("---------------------------------------");

for (Employee each:employees) {
    if (each.job_title.equals("Java Developer")) { // if the job title is Java Developer
        System.out.println(each.name); // prints the name of employee
    }

}

        System.out.println("---------------------------------------------------");
double max = employees.get(0).salary;
double min = employees.get(0).salary;
for (Employee each:employees){
    if(each.salary>max){
        max = each.salary;
    }
    if (each.salary<min){
        min = each.salary;
    }
}
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------------------------");


ArrayList<Employee> femaleEmployees = new ArrayList<>();
ArrayList<Employee> maleEmployees = new ArrayList<>();


        for (Employee each : employees) {
            if(each.gender == 'M'){ // if the employee is male
                maleEmployees.add(each); // the employee will be added to Male Employees List
            }
            if (each.gender=='F'){
                femaleEmployees.add(each);
            }
        }
        System.out.println("Total number of females employees: " +femaleEmployees.size());
        System.out.println("Total number of male employess: "+maleEmployees.size());


































    }
}
