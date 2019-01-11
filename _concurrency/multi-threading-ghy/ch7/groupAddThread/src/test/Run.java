package test;

import extthread.ThreadA;
import extthread.ThreadB;

public class Run {

    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();

        ThreadGroup group = new ThreadGroup("ߺҵ߳");

        Thread aThread = new Thread(group, aRunnable);
        Thread bThread = new Thread(group, bRunnable);
        aThread.start();
        bThread.start();

        System.out.println("߳Ϊ" + group.activeCount());
        System.out.println("߳Ϊ" + group.getName());

    }
}
