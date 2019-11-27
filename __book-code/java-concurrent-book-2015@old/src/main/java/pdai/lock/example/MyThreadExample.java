package pdai.lock.example;

import java.util.concurrent.locks.LockSupport;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 9:13
 */

public class MyThreadExample extends Thread {
    private Object object;

    public MyThreadExample(Object object) {
        this.object = object;
    }

    public void run() {
        System.out.println("before unpark");
        // 释放许可
        LockSupport.unpark((Thread) object);
        System.out.println("after unpark");
    }
}
