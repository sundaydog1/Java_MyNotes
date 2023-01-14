package day43_ExtraTopics;

import java.util.Arrays;

public class TestEnum {
    public static void main(String[] args) {

     //   String day = "Java"; // no restrictions for a string, though Java is not a day

        Day day = Day.MONDAY;

        switch (day){
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday");
                break;
        }

      Day[] weekday=  Day.values();
        System.out.println(Arrays.toString(weekday));
    }
}
