package tech.pdai.basics;

import tech.pdai.basics.example.MyRunnableExample;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 16:44
 */
public class MyRunnableDemo {

    public static void main(String[] args) {
        MyRunnableExample instance = new MyRunnableExample();
        Thread thread = new Thread(instance);
        thread.start();
    }

}
