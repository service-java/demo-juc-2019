package test;

import extthread.MyThread;

public class Run {

    public static void main(String[] args) {

        MyThread[] array = new MyThread[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = new MyThread();
        }
        for (int i = 0; i < 10000; i++) {
            array[i].start();
            if (array[i].isAlive() == false) {
                System.out.println("ˣȻstart()ˣ״̬Ϊfalse");
            }
        }

    }

}
