package pdai.keyword;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-22 9:28
 */
public class SynchronizedObjectClazzDemo implements Runnable {
    static SynchronizedObjectClazzDemo instance1 = new SynchronizedObjectClazzDemo();
    static SynchronizedObjectClazzDemo instance2 = new SynchronizedObjectClazzDemo();

    @Override
    public void run() {
        // 所有线程需要的锁都是同一把
        synchronized (SynchronizedObjectClazzDemo.class) {
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();

/*      我是线程Thread-0
        Thread-0结束
        我是线程Thread-1
        Thread-1结束*/
    }
}
