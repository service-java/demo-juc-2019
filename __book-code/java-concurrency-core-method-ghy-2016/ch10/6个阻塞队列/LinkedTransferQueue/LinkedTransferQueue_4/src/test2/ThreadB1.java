package test2;

public class ThreadB1 extends Thread {

    private MyServiceB service;

    public ThreadB1(MyServiceB service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " beginA "
                + System.currentTimeMillis());
        System.out.println("tryTransfer(e) ֵΪ"
                + service.queue.tryTransfer(""));
        System.out.println(Thread.currentThread().getName() + "   endA "
                + System.currentTimeMillis());
    }

}
