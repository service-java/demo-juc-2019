package ch3.s1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo implements Runnable {
    //5个一组输出
    private final Semaphore semp = new Semaphore(5);

    public void run() {
        try {
            semp.acquire();
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getId() + " done!");

            semp.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(20);
        final SemaphoreDemo demo = new SemaphoreDemo();
        for (int i = 0; i < 20; i++) {
            exec.submit(demo);
        }
    }
}
