package myrunnable;

public class MyRunnable1 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();

                if (Thread.currentThread().isInterrupted() == true) {
                    System.out.println("ûɣжˣ");
                    throw new InterruptedException();
                }
            }
            System.out.println("ɹɣ");
        } catch (InterruptedException e) {
            System.out.println("catchж");
            e.printStackTrace();
        }
    }
}
