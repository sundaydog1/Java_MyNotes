package day03_variables;
/*
1. Create a class named EmployeeInfo.java
2. Declare the following variables with appropriate data types:

1. name
2. age
3. gender
4. companyName
5. employeeId
6. jobTitle
7. salary
8. isFullTime
 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String name ="Kristina";
        int age = 37;
        char gender = 'F';
        String company_name = "Google Inc",
                jobTitle="QA tester",
                employeeId = "BL2009";
        int salary = 105000;
        boolean isFullTime = true;

        System.out.println(name);
        System.out.println("age = " + age);;
        System.out.println("gender = " + gender);
        System.out.println("company_name = " + company_name);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println(salary);
        System.out.println("isFullTime = " + isFullTime);
    }



}
