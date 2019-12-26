package tech.pdai.utils;

import java.util.concurrent.CountDownLatch;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 17:06
 */

class MyThread extends Thread {
    private CountDownLatch countDownLatch;

    public MyThread(String name, CountDownLatch countDownLatch) {
        super(name);
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " doing something");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finish");
        countDownLatch.countDown();
    }
}

public class CountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        MyThread t1 = new MyThread("t1", countDownLatch);
        MyThread t2 = new MyThread("t2", countDownLatch);
        t1.start();
        t2.start();
        System.out.println("Waiting for t1 thread and t2 thread to finish");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " continue");


/*      Waiting for t1 thread and t2 thread to finish
        t1 doing something
        t2 doing something
        t1 finish
        t2 finish
        main continue */

    }
}
