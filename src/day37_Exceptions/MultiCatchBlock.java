package day37_Exceptions;

import day35_Polymorphism.transportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {


        Car car = null;


        try {
            car.drive();// we can't call instance method if there was no object created
        }catch(ArithmeticException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        }catch(ClassCastException e) {
            System.out.println("Second Catch block");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch block");
            e.printStackTrace();
        }
        System.out.println("Program ended");


    }


}
