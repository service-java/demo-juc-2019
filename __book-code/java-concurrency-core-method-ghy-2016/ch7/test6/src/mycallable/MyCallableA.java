package mycallable;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA " + Thread.currentThread().getName()
                + " begin " + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {
            String newString = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableA =" + (i + 1));
        }
        if (1 == 1) {
            System.out.println("xxxxxxxx=ж");
            throw new NullPointerException();
        }
        System.out.println("MyCallableAEND " + Thread.currentThread().getName()
                + "   end " + System.currentTimeMillis());
        return "returnA";
    }

}
