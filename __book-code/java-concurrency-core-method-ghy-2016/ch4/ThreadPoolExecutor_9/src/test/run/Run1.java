package test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("ӡˣbegin "
                            + Thread.currentThread().getName());
                    Thread.sleep(4000);
                    System.out.println("ӡˣ      end "
                            + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 5,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        System.out.println("̳߳е߳A" + executor.getPoolSize());
        System.out.println("Z1=" + executor.prestartCoreThread());
        System.out.println("̳߳е߳B" + executor.getPoolSize());
        System.out.println("Z2=" + executor.prestartCoreThread());
        System.out.println("̳߳е߳C" + executor.getPoolSize());
        System.out.println("Z3=" + executor.prestartCoreThread());// Ч
        System.out.println("Z4=" + executor.prestartCoreThread());// Ч
        System.out.println("Z5=" + executor.prestartCoreThread());// Ч
        System.out.println("Z6=" + executor.prestartCoreThread());// Ч
        System.out.println("̳߳е߳D" + executor.getPoolSize());
    }

}
