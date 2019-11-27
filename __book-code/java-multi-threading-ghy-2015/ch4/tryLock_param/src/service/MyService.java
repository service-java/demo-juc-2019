package service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("      " + Thread.currentThread().getName()
                        + "ʱ䣺" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println("      " + Thread.currentThread().getName()
                        + "ûл");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
