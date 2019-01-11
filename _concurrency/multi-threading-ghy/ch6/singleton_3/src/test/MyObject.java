package test;

public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                // ģڴ֮ǰһЩ׼ԵĹ
                Thread.sleep(3000);
                // ʹsynchronized (MyObject.class)
                // Ȼִ뱻
                // з̰߳ȫ
                synchronized (MyObject.class) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
