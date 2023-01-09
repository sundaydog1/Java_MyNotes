package day26_Statics.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    public String groupName;
    public int groupID;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupID) { // creates the StudentGroup be setting the groupName and groupID
        this.groupName = groupName;
        this.groupID = groupID;

    }

    public void addStudent(Student student){ // takes 1 student object and adds it to arrayList of students
        students.add(student);
    }
public void addStudent(String name, int age, char gender,String id){ // takes name ,age,gender, id of student info, creates Student object by given info, than adds the student object to the Array
    //    Student student = new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
}

public void addStudent(Student [] students){
        this.students.addAll(Arrays.asList(students));
}

public void removeStudent(String id){ // takes the id and then removes a student object with specified id from the arrayList of students
        students.removeIf(p-> p.id.equals(id));
}


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupID=" + groupID +
                ", number of students=" + students.size() +
                '}';
    }
}
