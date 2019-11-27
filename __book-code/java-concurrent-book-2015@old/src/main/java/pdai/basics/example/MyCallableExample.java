package pdai.basics.example;

import java.util.concurrent.Callable;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 16:38
 */


public class MyCallableExample implements Callable<Integer> {
    public Integer call() {
        return 123;
    }
}
