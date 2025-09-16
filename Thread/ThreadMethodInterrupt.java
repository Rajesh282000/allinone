package Thread;

public class ThreadMethodInterrupt extends Thread {

    @Override
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("Thread is running......");
        }catch(Exception e){
            System.out.println("Thread is interrupted " + e);
        }

    }

    public static void main(String[] args) {
        ThreadMethodInterrupt t1 = new ThreadMethodInterrupt();
        t1.start();
        t1.interrupt();
    }
}

//interrupt() method is used to interrupt the thread