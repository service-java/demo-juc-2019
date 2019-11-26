package test;

public class MyObject {

    // طʽ==ģʽ
    private static MyObject myObject = new MyObject();

    private MyObject() {
    }

    public static MyObject getInstance() {
        // ˴汾Ϊ
        // ˰汾ȱǲʵ
        // ΪgetInstance()ûͬ
        // пַ̰ܳ߳ȫ
        return myObject;
    }

}
