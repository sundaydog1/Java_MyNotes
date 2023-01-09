package day33_Abstraction.employeeTask;

public abstract class Employee {
    private String name;
    private int age;
    private char gender;
    private String id;
    private double salary;
    private String job_title;

    public Employee(String name, int age, char gender, String id, double salary, String job_title) {
        setName(name);
        setAge(age);
       setGender(gender);
       setId(id);
      setSalary(salary);
       setJob_title(job_title);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

public abstract void work(); // abstract (incompleted)method

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", job_title='" + job_title + '\'' +
                '}';
    }
}
