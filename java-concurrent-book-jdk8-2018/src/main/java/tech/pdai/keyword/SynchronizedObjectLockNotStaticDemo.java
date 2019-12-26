package tech.pdai.keyword;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-22 9:24
 */
public class SynchronizedObjectLockNotStaticDemo implements Runnable {
    static SynchronizedObjectLockNotStaticDemo instance1 = new SynchronizedObjectLockNotStaticDemo();
    static SynchronizedObjectLockNotStaticDemo instance2 = new SynchronizedObjectLockNotStaticDemo();

    @Override
    public void run() {
        method();
    }

    // synchronized用在普通方法上，默认的锁就是this，当前实例
    public synchronized void method() {
        System.out.println("我是线程" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        // t1和t2对应的this是两个不同的实例，所以代码不会串行
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();

/*      我是线程Thread-0
        我是线程Thread-1
        Thread-0结束
        Thread-1结束 */

    }
}

