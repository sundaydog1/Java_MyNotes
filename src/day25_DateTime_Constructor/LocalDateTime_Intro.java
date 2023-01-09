package day25_DateTime_Constructor;

import java.time.LocalDateTime;
public class LocalDateTime_Intro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

LocalDateTime ends = LocalDateTime.of (2023,5,18,11,0);
        System.out.println("ends = " + ends);

        System.out.println(starts.getDayOfWeek());
        System.out.println(starts.getHour());
    }
}
