package Thread;

public class ThreadMethodYield extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() +" is running " + i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadMethodYield t1 = new ThreadMethodYield();
        t1.start();
        ThreadMethodYield t2 = new ThreadMethodYield();
        t2.start();
    }
}
