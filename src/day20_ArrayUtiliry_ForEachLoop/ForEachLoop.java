package day20_ArrayUtiliry_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------------------------");

        for (int each : numbers){
            System.out.println(each);
        }





    }









}
