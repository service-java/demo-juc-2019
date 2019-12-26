package tech.pdai.basics;

import tech.pdai.basics.example.LockExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 17:01
 */
public class ReentrantLockDemo {

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> lockExample.func());
        executorService.execute(() -> lockExample.func());

        // 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
    }

}
