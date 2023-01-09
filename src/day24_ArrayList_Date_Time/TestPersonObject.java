package day24_ArrayList_Date_Time;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {

        Person [] people = {new Person(), new Person (), new Person (), new Person (), new Person ()};
        people [0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
people [1].setInfo("Lucy",'F',LocalDate.of(1996,7,1));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        // print name & date of birth of each person object
        // remove all the person object that has age>55








    }
}
