package pdai.collection;

import cn.hutool.core.lang.Console;
import pdai.collection.example.DelayedElement;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 14:19
 */
public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {

        DelayQueue queue = new DelayQueue();
        Delayed element1 = new DelayedElement();
        queue.put(element1);
        Delayed element2 = queue.take();
        Console.log(element2);

        /*        pdai.collection.example.DelayedElement@28a418fc*/

    }
}
