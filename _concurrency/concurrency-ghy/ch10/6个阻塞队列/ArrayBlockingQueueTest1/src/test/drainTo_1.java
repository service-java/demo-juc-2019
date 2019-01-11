package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class drainTo_1 {

    public static void main(String[] args) {
        // drainTo:
        // Ƴ˶пõԪأӵ collection С
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        queue.add("myString1");
        queue.add("myString2");
        queue.add("myString3");

        List list1 = new ArrayList();

        System.out.println(queue.drainTo(list1));

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println(queue.size());
    }
}
