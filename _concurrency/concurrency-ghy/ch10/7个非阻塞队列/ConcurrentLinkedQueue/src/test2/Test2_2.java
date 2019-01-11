package test2;

import myservice.MyService1;

public class Test2_2 {

    public static void main(String[] args) {
        MyService1 service = new MyService1();
        service.queue.add("a");
        service.queue.add("b");
        service.queue.add("c");
        System.out.println(service.queue.poll());
    }

}
