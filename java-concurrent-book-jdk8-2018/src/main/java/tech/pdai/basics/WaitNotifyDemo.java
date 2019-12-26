package tech.pdai.basics;

import tech.pdai.basics.example.WaitNotifyExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 17:09
 */
public class WaitNotifyDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }

}
