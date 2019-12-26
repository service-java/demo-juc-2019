package tech.pdai.atomic;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-22 16:54
 */
public class AtomicStampedReferenceDemo {
    private static AtomicStampedReference<Integer> atomicStampedRef = new AtomicStampedReference<>(1, 0);

    public static void main(String[] args) {
        Thread main = new Thread(() -> {
            System.out.println("操作线程" + Thread.currentThread() + ",初始值 a = " + atomicStampedRef.getReference());
            // 获取当前标识别
            int stamp = atomicStampedRef.getStamp();
            try {
                //等待1秒 ，以便让干扰线程执行
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 此时expectedReference未发生改变，但是stamp已经被修改了,所以CAS失败
            boolean isCASSuccess = atomicStampedRef.compareAndSet(1, 2, stamp, stamp + 1);
            System.out.println("操作线程" + Thread.currentThread() + ",CAS操作结果: " + isCASSuccess);
        }, "主操作线程");

        Thread other = new Thread(() -> {
            // 确保thread-main 优先执行
            Thread.yield();
            atomicStampedRef.compareAndSet(1, 2, atomicStampedRef.getStamp(), atomicStampedRef.getStamp() + 1);
            System.out.println("操作线程" + Thread.currentThread() + ",【increment】 ,值 = " + atomicStampedRef.getReference());
            atomicStampedRef.compareAndSet(2, 1, atomicStampedRef.getStamp(), atomicStampedRef.getStamp() + 1);
            System.out.println("操作线程" + Thread.currentThread() + ",【decrement】 ,值 = " + atomicStampedRef.getReference());
        }, "干扰线程");

        main.start();
        other.start();
    }

}
