package test;

import entity.PublicVar;
import extthread.ThreadA;

public class Test {

    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();

            Thread.sleep(200);// ӡֵܴСӰ

            publicVarRef.getValue();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
