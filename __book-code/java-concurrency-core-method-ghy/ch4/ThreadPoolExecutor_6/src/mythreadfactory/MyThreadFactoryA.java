package mythreadfactory;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactoryA implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread newThread = new Thread(r);
        newThread.setName("ߺң" + new Date());
        return newThread;
    }
}
