package test.run;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

    public static void main(String[] args) {
        // pollȡƳʾһ Future򷵻 null
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletionService csRef = new ExecutorCompletionService(executorService);
        for (int i = 0; i < 1; i++) {
            csRef.submit(new Callable<String>() {
                public String call() throws Exception {
                    Thread.sleep(3000);
                    System.out.println("3");
                    return "ߺ3s";
                }
            });
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(csRef.poll());
        }
    }
}
