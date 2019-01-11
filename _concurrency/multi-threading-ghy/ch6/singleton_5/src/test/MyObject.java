package test;

public class MyObject {

    private volatile static MyObject myObject;

    private MyObject() {
    }

    // ʹ˫
    // ֤˲Ҫͬ첽
    // ֱ֤˵Ч
    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                // ģڴ֮ǰһЩ׼ԵĹ
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
    // ˰汾ĴΪ
    // ˫ؼDouble-Check Locking

}
