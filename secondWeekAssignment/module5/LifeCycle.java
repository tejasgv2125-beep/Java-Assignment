package secondWeekAssignment.module5;

class LifeCycle extends Thread {

    public void run() {
        try {
            System.out.println("Thread is in RUNNING state");

            Thread.sleep(1000);

            System.out.println("Thread resumed after sleep");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        LifeCycle t1 = new LifeCycle();

        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after start(): " + t1.getState());

        Thread.sleep(200);
        System.out.println("State during sleep: " + t1.getState());

        t1.join();


        System.out.println("State after completion: " + t1.getState());
    }
}