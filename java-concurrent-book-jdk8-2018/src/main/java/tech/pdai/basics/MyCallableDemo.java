package tech.pdai.basics;

import tech.pdai.basics.example.MyCallableExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 16:39
 */
public class MyCallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallableExample mc = new MyCallableExample();

        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread thread = new Thread(ft);
        thread.start();

        System.out.println(ft.get()); // 123
    }
}
