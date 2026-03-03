package secondWeekAssignment.module5;

public class ThreadDemo {


    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread created using Thread class");
        }
    }


    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread created using Runnable interface");
        }
    }

    public static void main(String[] args) {


        MyThread t1 = new MyThread();
        t1.start();


        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        t2.start();

        System.out.println("Main thread executed");
    }
}
