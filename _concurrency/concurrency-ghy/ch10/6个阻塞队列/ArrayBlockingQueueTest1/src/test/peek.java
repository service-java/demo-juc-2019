package test;

import java.util.concurrent.ArrayBlockingQueue;

public class peek {

    public static void main(String[] args) {
        // peek:
        // ǲƳ˶еͷ˶Ϊգ򷵻 null
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        System.out.println(queue.peek());
        System.out.println(queue.offer("myString1"));
        System.out.println(queue.offer("myString2"));
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
    }
}
