package day33_Abstraction.employeeTask;

public class Tester extends Employee{
    @Override
    public void work() {
        System.out.println(getName()+" is testing application");
    }

    public Tester(String name, int age, char gender, String id, double salary, String job_title) {
        super(name, age, gender, id, salary, job_title);
    }
}
