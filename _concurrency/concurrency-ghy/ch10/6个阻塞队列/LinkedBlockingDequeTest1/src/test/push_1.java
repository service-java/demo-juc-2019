package test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class push_1 {

    public static void main(String[] args) {
        // push
        // Ԫز˫˶еĿͷ
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        deque.push("anyString1");
        deque.push("anyString2");
        deque.push("anyString3");
        System.out.println(deque.size());
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
