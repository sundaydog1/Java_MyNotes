package day28_OOP_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        if(name==null){ // if the name is not set yet
            name = "Unknown";
        }

        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()|| name.isBlank()){
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isBlank()||jobTitle.isEmpty()){
            System.err.println("Job title can not be empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary(){ // get doesn't need any parameters, because it only needs to read the data
    return salary;
}


    public void setSalary(double salary) { // setter needs a parameter, which gonna
        if (salary < 0) {                    // be a new value of the variable
            System.err.println("Salary can not be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }
        public String toString() {
            return "Employee{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", jobTitle='" + getJobTitle() + '\'' +
                    ", salary=" + getSalary() +
                    '}';
        }
    }

