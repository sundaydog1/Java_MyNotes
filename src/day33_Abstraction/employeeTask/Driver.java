package day33_Abstraction.employeeTask;

public class Driver extends Employee {

    public Driver(String name, int age, char gender, String id, double salary, String job_title) {
        super(name, age, gender, id, salary, job_title);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }
}
