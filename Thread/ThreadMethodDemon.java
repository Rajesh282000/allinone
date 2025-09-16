package Thread;

public class ThreadMethodDemon extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("Thread is running......");
        }
    }

    public static void main(String[] args) {
        ThreadMethodDemon t1 = new ThreadMethodDemon();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Thread is running......");
    }
}
