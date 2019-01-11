package service;

import java.util.concurrent.Semaphore;

public class Service {

    private Semaphore semaphore = new Semaphore(3);

    public void testMethod() {
        if (semaphore.tryAcquire(3)) {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + "ѡ룡");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            // releaseӦpermitsֵҲҪ
            semaphore.release(3);
        } else {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + "δɹ룡");
        }

    }
}
