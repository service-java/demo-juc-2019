package exthread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("Ѿֹͣ״̬!Ҫ˳!");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
