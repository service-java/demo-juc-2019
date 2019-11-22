package service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyService {

    private CyclicBarrier cbRef;

    public MyService(CyclicBarrier cbRef) {
        super();
        this.cbRef = cbRef;
    }

    private void beginRun(int count) {
        try {
            System.out.println(Thread.currentThread().getName()
                    + "  ڵȴ˶˿ʼ");
            if (Thread.currentThread().getName().equals("Thread-2")) {
                System.out.println("thread-2");
                Thread.sleep(5000);
                Thread.currentThread().interrupt();
            }
            cbRef.await();
            System.out.println("ˣʼ!");
            System.out.println(Thread.currentThread().getName() + " յ㣬"
                    + count + "");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException e " + cbRef.isBroken());
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("BrokenBarrierException e "
                    + cbRef.isBroken());
            e.printStackTrace();
        }

    }

    public void testA() {
        // 1
        for (int i = 0; i < 1; i++) {
            beginRun(i + 1);
        }
    }
}
