package extthread;

public class MyThreadA extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(" begin " + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis() + " ");
            Thread.sleep(5000);
            System.out.println("   end " + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis() + " ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
