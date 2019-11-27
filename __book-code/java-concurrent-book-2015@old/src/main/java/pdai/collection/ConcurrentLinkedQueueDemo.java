package pdai.collection;

import org.junit.jupiter.api.Test;
import pdai.collection.example.GetThreadExample;
import pdai.collection.example.PutThreadExample;

import java.util.concurrent.ConcurrentLinkedQueue;


/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 13:36
 */


public class ConcurrentLinkedQueueDemo {

    @Test
    public void main() {
        ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
        PutThreadExample p1 = new PutThreadExample(clq);
        GetThreadExample g1 = new GetThreadExample(clq);

        p1.start();
        g1.start();

    }
}
