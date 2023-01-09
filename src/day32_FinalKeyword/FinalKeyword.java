package day32_FinalKeyword;

import java.time.LocalDate;


class CydeoStudent{

    public final void language(){ // this method still can be inherited to other classes,
                                    // but it can't be overridden
        System.out.println("Java");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
       final  char gender = 'M';

    //     gender = 'F'; // can't be reassigned

        System.out.println(gender);  // M


     final   LocalDate dateOfBirth = LocalDate.now();

//dateOfBirth = dateOfBirth.plusYears(1);// can't be changed

        System.out.println(dateOfBirth);


        System.out.println("------------------------------------------------");

    }
}
