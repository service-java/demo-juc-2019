package test3;

public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        MyServiceC service = new MyServiceC();

        for (int i = 0; i < 10; i++) {
            ThreadC a = new ThreadC(service);
            a.setName("a");
            a.start();
        }
        Thread.sleep(1000);
        System.out
                .println("û߳ڵȴ? " + service.queue.hasWaitingConsumer());
        System.out.println("" + service.queue.getWaitingConsumerCount()
                + "߳ڵȴ");
    }
}
