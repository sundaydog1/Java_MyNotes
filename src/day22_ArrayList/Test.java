package day22_ArrayList;
import utilities.ArraysUtility;
public class Test {
    public static void main(String[] args) {

        int [] numbers ={10,85,1,2,5,5,98989,-488,0};

     boolean has5=   ArraysUtility.contains(numbers,5);

        System.out.println(has5);

        System.out.println("--------------------------------------------");

        String[] students = {"Lali","Olga","Filippe","Hamza","Diego"};
        System.out.println(ArraysUtility.contains(students,"Elda"));
    }
}
