package test;

import exthread.MyThread;

import exthread.MyThread;

public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("Ƿֹͣ1=" + thread.isInterrupted());
            System.out.println("Ƿֹͣ2=" + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

