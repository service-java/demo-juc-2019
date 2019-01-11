package test5;

public class Test5 {

    public static void main(String[] args) throws InterruptedException {
        try {
            MyService5 myService = new MyService5();

            Thread5A a = new Thread5A(myService);
            a.start();

            Thread.sleep(1000);

            Thread5B b = new Thread5B(myService);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ɹ֧
        // LinkedHashMapȻ֧˳ԣֲֲ֧

    }
}
