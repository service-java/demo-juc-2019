package extthread;

public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();

            System.out.println("߳Brun endӡ");
        } catch (InterruptedException e) {
            System.out.println("߳Bcatchӡ");
            e.printStackTrace();
        }
    }

}
