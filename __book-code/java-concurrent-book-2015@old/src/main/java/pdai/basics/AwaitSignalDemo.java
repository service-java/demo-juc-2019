package pdai.basics;

import pdai.basics.example.AwaitSignalExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 17:10
 */
public class AwaitSignalDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        AwaitSignalExample example = new AwaitSignalExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }

}
