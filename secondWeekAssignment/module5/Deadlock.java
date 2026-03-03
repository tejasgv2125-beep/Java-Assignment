package secondWeekAssignment.module5;

public class Deadlock {

    static final Object resource1 = new Object();
    static final Object resource2 = new Object();

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked Resource 1");

                try { Thread.sleep(100); }
                catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for Resource 2");

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked Resource 2");
                }
            }
        });


        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked Resource 2");

                try { Thread.sleep(100); }
                catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for Resource 1");

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}