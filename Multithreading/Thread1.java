package Multithreading;

public class Thread1 extends Thread {

    // Overloaded constructor --> giving thread name
    public Thread1(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // print name of thread --> Thread.currentThread().getName()
            System.out.println("inside thread " + Thread.currentThread().getName() + " " + i);
        }
    }
}
