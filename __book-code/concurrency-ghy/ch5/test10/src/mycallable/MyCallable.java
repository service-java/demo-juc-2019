package mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int i = 0;
        while (i == 0) {
            System.out.println("zzzzzzzzz");
        }
        return "ҵ100";
    }

}
