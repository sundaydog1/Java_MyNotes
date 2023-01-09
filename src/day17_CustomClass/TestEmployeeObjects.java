package day17_CustomClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("Ashley Kucuk",34,'F',"java developer","A1285K",105000);

        Employee employee2 = new Employee();
        employee2.setInfo("Pavel Gudkov",29,'M',"Architect", "EX600",125000);

        Employee employee3 = new Employee();
        employee3.setInfo("Katya",21,'F',"assistant", "NO98",85000);

        employee2.age = 39; // reassign the value of a variable
        employee3.name = "Eli";

        System.out.println(employee1);
        System.out.println(employee2);

employee3.work();
















    }
































}
