package pdai.collection.example;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 13:38
 */
public class GetThreadExample extends Thread {
    private ConcurrentLinkedQueue<Integer> clq;
    public GetThreadExample(ConcurrentLinkedQueue<Integer> clq) {
        this.clq = clq;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("poll " + clq.poll());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

