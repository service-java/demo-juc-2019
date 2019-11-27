package test;

import extthread.MyThread;

public class Test {

    public static void main(String[] args) {

        MyThread threadTest = new MyThread();
        threadTest.start();

        // Thread.sleep(?)
        System.out.println("뵱threadTestִϺִ");
        System.out.println("еsleep()еֵӦдأ");
        System.out.println("ǣݲȷ:)");
    }

}
