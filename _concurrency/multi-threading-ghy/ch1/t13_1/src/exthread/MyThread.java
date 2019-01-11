package exthread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("Ѿֹͣ״̬!Ҫ˳!");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("for");
        } catch (InterruptedException e) {
            System.out.println("MyThread.javarunеcatchˣ");
            e.printStackTrace();
        }
    }
}
