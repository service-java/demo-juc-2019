package test.run;

import mythread.MyThread;

public class Run {

    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup("ҵ߳");

            for (int i = 0; i < 5; i++) {
                MyThread thread = new MyThread(group, "߳" + (i + 1));
                thread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("interrupt()");
        } catch (InterruptedException e) {
            System.out.println("ͣͣˣ");
            e.printStackTrace();
        }

    }

}
