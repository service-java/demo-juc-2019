package test;

import java.util.concurrent.LinkedBlockingDeque;

public class takeFirst_2 {

    public static void main(String[] args) {
        try {
            LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
            System.out.println("begin");
            System.out.println(deque.takeFirst());
            System.out.println("  end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
