package day09_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 15;
        String result = "";

        switch (month){
            case 2 : result ="28 days";
            break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result = "31 days";   //This way we are achieving OR logic in switch by
                // declaring cases with the same result back to back. we can put them in 1 line like this
                break;      // DONT FORGET BREAK!

            case 4:                 // or we can declare cases like this w/o case body except the
            case 6:                 // one in the end
            case 9:
            case 11:
                result = "30 days";
                break;      // DON'T FORGER BREAK!

            default:
                result = "Invalid number";

                System.out.println(result);



        }





    }




}
