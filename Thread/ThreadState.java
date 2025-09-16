package Thread;

public class ThreadState extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState ts = new ThreadState();
        System.out.println(ts.getState());//New
        ts.start();
        System.out.println(ts.getState());//RUNNABLE
       // System.out.println(Thread.currentThread().getState());
        Thread.sleep(1000);
        System.out.println(ts.getState());//TIMED_WAITING
        ts.join();
        System.out.println(ts.getState());//TERMINATED

    }
}
