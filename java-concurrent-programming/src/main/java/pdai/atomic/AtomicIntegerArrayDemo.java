package pdai.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-22 17:04
 */
public class AtomicIntegerArrayDemo {


    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerArray array = new AtomicIntegerArray(new int[]{0, 0});
        System.out.println(array);
        System.out.println(array.getAndAdd(1, 2));
        System.out.println(array);
    }
}
