package test2;

public class Thread2B extends Thread {

    private MyService2 service;

    public Thread2B(MyService2 service) {
        super();
        this.service = service;
    }

    public void run() {
        for (int i = 0; i < 50000; i++) {
            service.map.put("ThreadB" + (i + 1), "ThreadB" + i + 1);
            System.out.println("ThreadB" + (i + 1));
        }
    }
}
