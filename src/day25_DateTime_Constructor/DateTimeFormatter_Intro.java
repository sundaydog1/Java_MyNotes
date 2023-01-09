package day25_DateTime_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatter_Intro {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yy, EEEE"); // the pattern provided as a String

        LocalDate today = LocalDate.now();

        System.out.println(today.format (df));

LocalDate date1 = LocalDate.of(2022,7,1);
        System.out.println(date1.format(df));

        System.out.println("-----------------------------------------");

        DateTimeFormatter tf= DateTimeFormatter.ofPattern ("HH:mm ");

        LocalTime time1 = LocalTime.of(7,5); // ==>07:05
        System.out.println(time1.format(tf));


DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm a");
LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));

    }
}
