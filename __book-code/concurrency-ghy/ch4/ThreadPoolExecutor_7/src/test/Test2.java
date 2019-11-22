package test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrejectedexecutionhandler.MyRejectedExecutionHandler;
import myrunnable.MyRunnable1;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable1 = new MyRunnable1("й1");
        MyRunnable1 myRunnable2 = new MyRunnable1("й2");
        MyRunnable1 myRunnable3 = new MyRunnable1("й3");
        MyRunnable1 myRunnable4 = new MyRunnable1("й4");

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 9999L,
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        pool.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        pool.execute(myRunnable1);
        pool.execute(myRunnable2);
        pool.execute(myRunnable3);
        pool.execute(myRunnable4);
    }
}
