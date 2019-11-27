package test;

import java.util.concurrent.CountDownLatch;

import extthread.MyThread;

public class Run {

    public static void main(String[] args) {
        try {
            CountDownLatch comingTag = new CountDownLatch(10);
            CountDownLatch waitTag = new CountDownLatch(1);
            CountDownLatch waitRunTag = new CountDownLatch(10);
            CountDownLatch beginTag = new CountDownLatch(1);
            CountDownLatch endTag = new CountDownLatch(10);

            MyThread[] threadArray = new MyThread[10];
            for (int i = 0; i < threadArray.length; i++) {
                threadArray[i] = new MyThread(comingTag, waitTag, waitRunTag,
                        beginTag, endTag);
                threadArray[i].start();
            }
            System.out.println("Աڵȴѡֵĵ");
            comingTag.await();
            System.out.println("п˶Աˣ͸λǰѲӡʱ5");
            Thread.sleep(5000);
            waitTag.countDown();
            System.out.println("͸λ");
            waitRunTag.await();
            Thread.sleep(2000);
            System.out.println("ǹ");
            beginTag.countDown();
            endTag.await();
            System.out.println("˶ԱͳƱΣ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
