package extthread;

public class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("ֹͣ!");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }

}
