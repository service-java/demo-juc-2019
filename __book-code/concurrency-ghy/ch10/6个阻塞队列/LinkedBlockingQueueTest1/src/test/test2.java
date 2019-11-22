package test;

import service.MyServiceA;
import extthread.ThreadA;

public class test2 {

    public static void main(String[] args) throws InterruptedException {
        // ʵ֤ArrayListǷ̰߳ȫ
        MyServiceA service = new MyServiceA();
        for (int i = 0; i < 100; i++) {
            ThreadA a = new ThreadA(service);
            a.start();
        }
        Thread.sleep(20000);
        System.out.println(service.list.size());
    }
}
