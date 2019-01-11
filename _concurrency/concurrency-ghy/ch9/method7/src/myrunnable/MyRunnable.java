package myrunnable;

import entity.Userinfo;

public class MyRunnable implements Runnable {

    private Userinfo userinfo;

    public MyRunnable(Userinfo userinfo) {
        super();
        this.userinfo = userinfo;
    }

    public void run() {
        try {
            userinfo.setUsername("õֵ");
            System.out.println("Ѿᣡ");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
