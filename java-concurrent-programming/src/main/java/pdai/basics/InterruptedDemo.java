package pdai.basics;

import cn.hutool.core.lang.Console;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 16:50
 */
public class InterruptedDemo {

    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (!interrupted()) {
                Console.log("没人阻止我吗??");
            }
            System.out.println("Thread end");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread2 = new MyThread2();
        thread2.start();
        thread2.sleep(20);
        thread2.interrupt();
    }


}
