package test1;

import myservice.MyService;
import extthread.ThreadA;
import extthread.ThreadB;

public class Test {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            ThreadA a = new ThreadA(service);
            ThreadB b = new ThreadB(service);

            a.start();
            b.start();
            a.join();
            b.join();

            System.out.println(service.queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
