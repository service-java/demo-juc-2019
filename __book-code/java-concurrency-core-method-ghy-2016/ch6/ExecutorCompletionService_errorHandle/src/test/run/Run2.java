package test.run;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import mycallable.MyCallableA;
import mycallable.MyCallableB;

public class Run2 {

    public static void main(String[] args) {
        try {
            MyCallableA callableA = new MyCallableA();
            MyCallableB callableB = new MyCallableB();

            Executor executor = Executors.newSingleThreadExecutor();
            CompletionService csRef = new ExecutorCompletionService(executor);
            csRef.submit(callableA);// ִеA
            csRef.submit(callableB);// ִеB

            for (int i = 0; i < 2; i++) {
                System.out.println("zzzzzzzzzzzz" + " " + csRef.take().get());
            }
            System.out.println("main end!");

            FutureTask abc;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
