package pdai.basics.example;

import cn.hutool.core.lang.Console;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 16:43
 */
public class MyRunnableExample implements Runnable {

    public void run() {
        Console.log("为什么调用我!! 我好想睡觉...");
    }
}
