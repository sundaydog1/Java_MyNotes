package day38_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) {

// method1();// we will still get an exception when this method is called

    }

    public static void pauseFor5Seconds() throws InterruptedException{ // throws keyword only
                                                                        // handles the exception withing this method
Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException { // in order to avoid exception in this method we need to use throw keyword in its signature,
                                                                // otherwise the exception will occur again
        System.out.println("Hellow worlds");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }

    public static void method2(){
        System.out.println();
    }

}
