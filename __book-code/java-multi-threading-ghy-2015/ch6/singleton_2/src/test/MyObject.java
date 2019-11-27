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
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
