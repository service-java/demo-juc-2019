package tech.pdai.lock;

import tech.pdai.lock.example.Consumer;
import tech.pdai.lock.example.Depot;
import tech.pdai.lock.example.Producer;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 10:04
 */
public class AQSDemo {
    public static void main(String[] args) {
        Depot depot = new Depot(500);
        new Producer(depot).produce(500);
        new Producer(depot).produce(200);
        new Consumer(depot).consume(500);
        new Consumer(depot).consume(200);


/*        produce = 500, size = 500
        Thread[200 produce thread,5,main] before await
        consume = 500, size = 0
        Thread[200 produce thread,5,main] after await
        produce = 200, size = 200
        consume = 200, size = 0*/

    }
}
