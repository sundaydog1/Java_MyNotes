package day24_ArrayList_Date_Time;

import java.time.LocalDate;

public class LocalDate_Intro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); // will always get the current date
        System.out.println(today);

LocalDate birthday = LocalDate.of(1995,04,18);
        System.out.println(birthday);

        System.out.println("==============================================");

        System.out.println(today.getYear()); //2022
        System.out.println(today.getMonth()); // NOVEMBER  => the name of the month

        System.out.println(today.getMonthValue()); //11  ==> the number of the month

        System.out.println(today.getDayOfWeek()); // Sunday
        System.out.println(birthday.getDayOfWeek());  // Tuesday

        System.out.println(today.getDayOfMonth()); //20
        System.out.println(today.getDayOfYear());  //324


        System.out.println("----------------------------------------------------");

   today =     today.plusYears(1); //2023-11-20  // we need to reaasign variavle today,
        // because otherwise it still will be referring to the current date, as date object is immutable


        System.out.println("------------------------------------------------");

LocalDate graduationDate = LocalDate.of(2025,6,4);

graduationDate = graduationDate.plusYears(2); //2025+2==>2027
        System.out.println(graduationDate);

graduationDate=   graduationDate.plusMonths(7); // add 7 more months
        System.out.println(graduationDate);

graduationDate=graduationDate.plusWeeks(7); //add 7 more weeks

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusDays(100);
        System.out.println(graduationDate);

        System.out.println("------------------------------------------");


LocalDate yourBirthday = LocalDate.of(2005,4,1);
LocalDate yourBrotherBirthday = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println("yourBrotherBirthday = " + yourBrotherBirthday);
        System.out.println("yourBirthday = " + yourBirthday);

        System.out.println("-------------------------------------");

LocalDate birthday1 = LocalDate.of(1994,7,7);
LocalDate birthday2 = LocalDate.of(1995,6,7);

boolean r1 =birthday1.isEqual(birthday2); // false
        System.out.println(r1);

        System.out.println("------------------------------------------------------");

LocalDate grad_date = LocalDate.of(2023,1,1);
        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));  //false
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));  //true

        System.out.println("---------------------------------------------------");

        System.out.println(LocalDate.of(2022,6,16).isLeapYear()); //false





























    }
}
