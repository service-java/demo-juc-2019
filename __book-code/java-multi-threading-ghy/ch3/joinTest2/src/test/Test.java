package test;

import extthread.MyThread;

public class Test {

    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();

            System.out.println("뵱threadTestִϺִУ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
