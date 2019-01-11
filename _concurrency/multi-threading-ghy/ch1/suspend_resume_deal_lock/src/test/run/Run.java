package test.run;

import testpackage.SynchronizedObject;

public class Run {

    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();

            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };

            thread1.setName("a");
            thread1.start();

            Thread.sleep(1000);

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out
                            .println("thread2ˣ벻printString()ֻӡ1begin");
                    System.out
                            .println("ΪprintString()a߳Զsuspendͣˣ");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
