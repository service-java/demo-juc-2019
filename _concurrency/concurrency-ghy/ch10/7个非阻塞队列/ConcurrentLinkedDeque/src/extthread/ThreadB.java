package extthread;

import myservice.MyService;

public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        while (!service.queue.isEmpty()) {
            service.queue.pollLast();
            System.out.println(service.queue.size());
        }
    }

}
