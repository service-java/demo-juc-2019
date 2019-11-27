package mythreadfactory;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Date;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactoryB implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread newThread = new Thread(r);
        newThread.setName("ҵƣ" + new Date());
        newThread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Զ崦쳣ã" + t.getName() + " "
                        + e.getMessage());
                e.printStackTrace();
            }
        });
        return newThread;
    }
}
