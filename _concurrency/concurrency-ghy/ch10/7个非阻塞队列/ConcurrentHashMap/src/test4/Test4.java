package test4;

public class Test4 {

    public static void main(String[] args) throws InterruptedException {
        try {
            MyService4 myService = new MyService4();

            Thread4A a = new Thread4A(myService);
            a.start();

            Thread.sleep(1000);

            Thread4B b = new Thread4B(myService);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
