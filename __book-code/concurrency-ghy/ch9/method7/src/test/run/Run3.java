package test.run;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import myrunnable.MyRunnable;
import entity.Userinfo;

public class Run3 {

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        Userinfo userinfo = new Userinfo();
        MyRunnable runnable = new MyRunnable(userinfo);

        ForkJoinPool pool = new ForkJoinPool();
        Future<Userinfo> future = pool.submit(runnable, userinfo);
        System.out.println(future);
        // ʹôַʽfuture.get()
        // Ϊget()Ч
        System.out.println("userinfo username=" + future.get().getUsername());
    }
}
