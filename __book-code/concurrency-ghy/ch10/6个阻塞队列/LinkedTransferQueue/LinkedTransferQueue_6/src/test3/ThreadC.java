package test3;

public class ThreadC extends Thread {

    private MyServiceC service;

    public ThreadC(MyServiceC service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " ȡõֵ"
                    + service.queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
