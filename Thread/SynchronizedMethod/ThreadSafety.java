package Thread.SynchronizedMethod;


class UnsafeCounter{
    private int count = 0;
    public void increment() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}

class SafeCounter{
    private int count = 0;
    public synchronized void increment() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSafety {
    public static void main(String[] args) {
        UnsafeCounter unsafeCounter = new UnsafeCounter();
        SafeCounter safeCounter = new SafeCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                unsafeCounter.increment();
                safeCounter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                unsafeCounter.increment();
                safeCounter.increment();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Unsafe counter: " + unsafeCounter.getCount());
        System.out.println("Safe counter: " + safeCounter.getCount());
    }
}
