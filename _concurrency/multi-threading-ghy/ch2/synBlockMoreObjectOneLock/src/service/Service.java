package service;

public class Service {

    public static void printA() {
        synchronized (Service.class) {
            try {
                System.out.println("߳Ϊ" + Thread.currentThread().getName()
                        + "" + System.currentTimeMillis() + "printA");
                Thread.sleep(3000);
                System.out.println("߳Ϊ" + Thread.currentThread().getName()
                        + "" + System.currentTimeMillis() + "뿪printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void printB() {
        synchronized (Service.class) {
            System.out.println("߳Ϊ" + Thread.currentThread().getName()
                    + "" + System.currentTimeMillis() + "printB");
            System.out.println("߳Ϊ" + Thread.currentThread().getName()
                    + "" + System.currentTimeMillis() + "뿪printB");
        }
    }
}
