package Thread;

public class ThreadMethod extends Thread{

    public ThreadMethod(String name) {
        super(name);
    }

    @Override
    public void run()  { // Second Method
        for (int i = 0; i <= 4; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + "- count: "+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethod tm = new ThreadMethod("Rajesh");
        tm.start(); // First Method
        tm.setPriority(1);
        tm.join(); // Third Method
        System.out.println("Hello");


   }
}

//start , run, sleep, join, setPriority, interrupt, yield