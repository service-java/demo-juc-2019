package tech.pdai.lock;


import tech.pdai.lock.example.MyThreadExample;

import java.util.concurrent.locks.LockSupport;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 9:13
 */
public class LockSupportDemo {

    public static void main(String[] args) {
        MyThreadExample myThread = new MyThreadExample(Thread.currentThread());
        myThread.start();

        try {
            // 主线程睡眠3s
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("before park");

        // 获取许可
        LockSupport.park("ParkAndUnparkDemo");
        System.out.println("after park");
    }
}
