package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import mytask.MyRecursiveTask;

public class Run {

    public static void main(String[] args) {
        try {
            MyRecursiveTask task = new MyRecursiveTask();
            ForkJoinPool pool = new ForkJoinPool();
            pool.execute(task);
            // execute޷ֵ
            // ȡ÷ֵͨ
            // RecursiveTask
            System.out.println(System.currentTimeMillis());
            System.out.println(task.get());
            System.out.println(System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
