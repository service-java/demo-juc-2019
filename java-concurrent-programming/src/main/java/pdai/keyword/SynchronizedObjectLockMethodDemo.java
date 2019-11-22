package pdai.keyword;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-22 9:15
 */
public class SynchronizedObjectLockMethodDemo implements Runnable {
    static SynchronizedObjectLockMethodDemo instance = new SynchronizedObjectLockMethodDemo();

    @Override
    public void run() {
        method();
    }

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
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();

 /*       我是线程Thread-0
        Thread-0结束
        我是线程Thread-1
        Thread-1结束*/
    }
}

