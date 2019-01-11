package test2;

public class Thread2A extends Thread {

    private MyService2 service;

    public Thread2A(MyService2 service) {
        super();
        this.service = service;
    }

    public void run() {
        for (int i = 0; i < 50000; i++) {
            service.map.put("ThreadA" + (i + 1), "ThreadA" + i + 1);
            System.out.println("ThreadA" + (i + 1));
        }
    }

}
