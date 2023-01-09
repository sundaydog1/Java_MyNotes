package day39_Collections.multiThreading;

public class TestMultiThreads {
    public static void main(String[] args) {

        Thread thread1 = new ThreadHelloWorld();

thread1.start();


        ThreadHelloWorld thread2 = new ThreadHelloWorld();

thread2.start();

    }
}
