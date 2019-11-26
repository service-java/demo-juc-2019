package test;

import java.util.concurrent.ArrayBlockingQueue;

public class remainingCapacity {

    public static void main(String[] args) {
        // £ڴԴԼ˶ܽܵԪ
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        System.out.println(queue.add("myString1"));
        System.out.println(queue.add("myString2"));
        System.out.println(queue.add("myString3"));
        System.out.println(queue.remainingCapacity());

    }
}
