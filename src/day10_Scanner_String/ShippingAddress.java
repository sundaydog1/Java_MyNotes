/*
 Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )
	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012
 */




package day10_Scanner_String;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your full name:");
         String full_name = input.nextLine();


        System.out.println("Enter your building number:");
        String building_number = input.next();

        System.out.println("Enter your street name:");
        input.nextLine ();
        String street_name = input.nextLine();

        System.out.println("Enter your city name:");
        String city_name = input.nextLine();

        System.out.println("Enter your state:");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        String zip = input.next();

        //-------------------------------------------------------

        System.out.println("Your shipping address is:");
        System.out.println("\t" + full_name+ "\n \t" +building_number +" "+street_name+"\n\t"+
                city_name+", "+state+" "+zip);


input.close();













    }







}
