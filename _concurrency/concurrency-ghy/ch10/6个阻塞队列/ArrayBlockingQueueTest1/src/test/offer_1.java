package test;

import java.util.concurrent.ArrayBlockingQueue;

public class offer_1 {

    public static void main(String[] args) {
        // offerЧδɹ򷵻false
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        System.out.println(queue.offer("myString1"));
        System.out.println(queue.offer("myString2"));
        System.out.println(queue.offer("myString3"));

        System.out.println(queue.size());

        System.out.println(queue.offer("myString4"));

        System.out.println(queue.size());

    }
}
