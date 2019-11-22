package test2;

import java.util.concurrent.TimeUnit;

public class ThreadB1 extends Thread {

    private MyServiceB service;

    public ThreadB1(MyServiceB service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " beginA "
                    + System.currentTimeMillis());
            System.out.println("ֵΪ"
                    + service.queue.tryTransfer("Ԫ", 5, TimeUnit.SECONDS));
            System.out.println(Thread.currentThread().getName() + "   endA "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
