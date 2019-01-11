package service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyService {
    private CyclicBarrier cbRef;

    public MyService(CyclicBarrier cbRef) {
        super();
        this.cbRef = cbRef;
    }

    public void beginRun() {
        try {
            long sleepValue = (int) (Math.random() * 10000);
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + " "
                    + System.currentTimeMillis() + " beginܵ1׶"
                    + (cbRef.getNumberWaiting() + 1));
            cbRef.await();
            System.out.println(Thread.currentThread().getName() + " "
                    + System.currentTimeMillis() + "   endܵ1׶" + " "
                    + cbRef.getNumberWaiting());
            // ///////
            sleepValue = (int) (Math.random() * 10000);
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + " "
                    + System.currentTimeMillis() + " beginܵ2׶"
                    + (cbRef.getNumberWaiting() + 1));
            cbRef.await();
            System.out.println(Thread.currentThread().getName() + " "
                    + System.currentTimeMillis() + "   endܵ2׶" + " "
                    + cbRef.getNumberWaiting());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
