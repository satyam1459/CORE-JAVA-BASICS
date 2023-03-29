package Multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main is starting ");

        Thread thread1 = new Thread1("Thread parameter ");
        thread1.setDaemon(true); // runs one the mercy of JVM
        thread1.start();

        // runnable implementing thread has object creation
        // Here we will putting our instance while implementing
        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();

        // thread class also implements runnable , so we can also call like this
        new Thread().run(); // if target is null nothing will happen

        // for (int i = 0; i < 5; i++)
        // System.out.println(i + " outside thread ");

        System.out.println("Main is existing");
    }
}
