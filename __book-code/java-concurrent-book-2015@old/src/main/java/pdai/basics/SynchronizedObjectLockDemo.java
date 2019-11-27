package pdai.basics;

import org.junit.jupiter.api.Test;
import pdai.basics.example.SynchronizedExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 16:57
 */
public class SynchronizedObjectLockDemo {

    public static void main(String[] args) {
        SynchronizedExample e1 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e1.func1());
    }

    @Test
    public void test() {
        SynchronizedExample e1 = new SynchronizedExample();
        SynchronizedExample e2 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e2.func1());
    }

}
