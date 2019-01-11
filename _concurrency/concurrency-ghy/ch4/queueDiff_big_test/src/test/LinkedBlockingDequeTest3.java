package test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable;

public class LinkedBlockingDequeTest3 {

    public static void main(String[] args) throws InterruptedException {
        // LinkedBlockingDequeʹ޲ι
        // maxֵ
        LinkedBlockingDeque linked = new LinkedBlockingDeque<Runnable>();
        System.out.println(linked.size());
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
                TimeUnit.SECONDS, linked);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        System.out.println(pool.getPoolSize() + " " + linked.size());
        // ʹnew LinkedBlockingDeque<Runnable>();޲ι
        // capacityֵInteger.MAX_VALUE
        // Դ£
        // public LinkedBlockingDeque() {
        // this(Integer.MAX_VALUE);
        // }
        // ˵LinkedBlockingDeque
        // Դ洢Integer.MAX_VALUE
        //
        // ȷ3ִ2
    }
}
