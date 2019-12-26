package tech.pdai.collection;

import cn.hutool.core.lang.Console;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 14:17
 */
public class ArrayBlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
        queue.put("1");
        String string = queue.take();
        Console.log(string);
    }
}
