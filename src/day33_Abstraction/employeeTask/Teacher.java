package day33_Abstraction.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, String id, double salary, String job_title) {
        super(name, age, gender, id, salary, job_title);
    }

    public void work(){
        System.out.println(getName()+" is teaching");

    }
}
