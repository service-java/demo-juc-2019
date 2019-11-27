package test2;

import myservice.MyService1;

public class Test2_1 {
    public static void main(String[] args) {
        MyService1 service = new MyService1();
        System.out.println(service.queue.poll());
    }
}
