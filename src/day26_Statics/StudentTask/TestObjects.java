package day26_Statics.StudentTask;

public class TestObjects {
    public static void main(String[] args) {


        Student student1 = new Student ("Kerry",21,'M',"A21");
        Student student2 = new Student ("John",29,'M',"A22");
        Student student3 = new Student ("Alice",23,'F',"A23");
        Student student4 = new Student ("Simon",25,'M',"A24");
        Student student5 = new Student ("Jesse",26,'M',"A25");

Student [] students = {student2,student1,student3, student4,student5};
StudentsGroup group1 = new StudentsGroup ("Java Turtles",1);

group1.addStudent(students);


        System.out.println(group1);

group1.addStudent("Tatiana",27,'F',"P01");
        System.out.println(group1);

        group1.removeStudent("A21");
        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name+" : "+each.id);
        }







    }
}