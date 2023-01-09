package day33_Abstraction.employeeTask;

public class Developer extends Employee {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int age, char gender, String id, double salary, String job_title, String programmingLanguage) {
        super(name, age, gender, id, salary, job_title);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName()+" is coding in "+programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", programming language = "+programmingLanguage+"}";
    }
}
