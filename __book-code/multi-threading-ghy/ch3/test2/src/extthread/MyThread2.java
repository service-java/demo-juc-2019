package extthread;

public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("ʼnotify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("notify time=" + System.currentTimeMillis());
        }
    }
}
