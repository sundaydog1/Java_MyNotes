package day39_Collections.multiThreading;

public class ThreadHelloWorld extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <6 ; i++) {
            System.out.println("Hello world "+i);
        }
    }
}
