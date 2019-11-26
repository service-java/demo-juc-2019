package test5;

public class Thread5B extends Thread {

    private MyService5 myService;

    public Thread5B(MyService5 myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.map.put("z", "zValue");
    }
}
