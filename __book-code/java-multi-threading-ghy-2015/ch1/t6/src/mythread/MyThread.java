package mythread;

public class MyThread extends Thread {

    public MyThread() {
        System.out.println("췽Ĵӡ" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("runĴӡ" + Thread.currentThread().getName());
    }

}
