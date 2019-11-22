package pdai.keyword;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-22 9:15
 */
public class SynchronizedObjectLockMultiDemo implements Runnable {
    static SynchronizedObjectLockMultiDemo instance = new SynchronizedObjectLockMultiDemo();

    // 创建2把锁
    Object block1 = new Object();
    Object block2 = new Object();

    @Override
    public void run() {
        // 这个代码块使用的是第一把锁，当他释放后，
        // 后面的代码块由于使用的是第二把锁，因此可以马上执行
        synchronized (block1) {
            System.out.println("block1锁,我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("block1锁,"+Thread.currentThread().getName() + "结束");
        }

        synchronized (block2) {
            System.out.println("block2锁,我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("block2锁,"+Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();

/*      block1锁,我是线程Thread-0
        block1锁,Thread-0结束
        block2锁,我是线程Thread-0
        block1锁,我是线程Thread-1
        block2锁,Thread-0结束
        block1锁,Thread-1结束
        block2锁,我是线程Thread-1
        block2锁,Thread-1结束*/
    }
}
