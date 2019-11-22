package service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
                System.out.println("ThreadName="
                        + Thread.currentThread().getName() + "ѡ룡");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    // String newString = new String();
                    // Math.random();
                }
                semaphore.release();
            } else {
                System.out.println("ThreadName="
                        + Thread.currentThread().getName() + "δɹ룡");
            }
            // releaseӦpermitsֵҲҪ
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
