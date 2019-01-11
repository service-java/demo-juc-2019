package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class retainAll {

    public static void main(String[] args) {
        //  collection ЩҲָ collection Ԫأѡ
        ArrayBlockingQueue queue = new ArrayBlockingQueue(4);
        System.out.println(queue.add("a"));
        System.out.println(queue.add("b"));
        System.out.println(queue.add("a"));
        System.out.println(queue.add("c"));

        List list = new ArrayList();
        list.add("b");
        list.add("c");

        System.out.println(queue.retainAll(list));

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
