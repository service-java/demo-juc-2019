package test;

public class Test2 {

    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn");
            synchronized (lock) {
                System.out.println("synһ");
                lock.wait();
                System.out.println("waitµĴ룡");
            }
            System.out.println("synĴ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
