package service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Service {

    private Semaphore semaphore = new Semaphore(3);

    public void testMethod() {
        // 1ĳ3
        try {
            if (semaphore.tryAcquire(3, 3, TimeUnit.SECONDS)) {
                System.out.println("ThreadName="
                        + Thread.currentThread().getName() + "ѡ룡");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                }
                // releaseӦpermitsֵҲҪ
                semaphore.release(3);
            } else {
                System.out.println("ThreadName="
                        + Thread.currentThread().getName() + "δɹ룡");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
