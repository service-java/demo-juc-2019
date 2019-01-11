package test;

import java.util.concurrent.ForkJoinPool;

import myrunnable.MyRunnable2;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 myRunnable = new MyRunnable2();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable);
        Thread.sleep(1000);
        pool.shutdownNow();// һյList
        pool.execute(myRunnable);
        System.out.println("main end!");
        Thread.sleep(Integer.MAX_VALUE);

        // shutdown:
        // ÿֱ
        // عرպִв׳RejectedExecutionException쳣

        // shutdownNowisInterrupted() ==trueж:
        // ֹͣǰִе
        // عرպִв׳RejectedExecutionException쳣

        // shutdownNowδisInterrupted() ==trueж:
        // ÿֱ
        // عرպִв׳RejectedExecutionException쳣
    }
}
