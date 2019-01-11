package extthread;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    private CountDownLatch comingTag;// еȴ˶Ա
    private CountDownLatch waitTag;// ȴ˵׼ʼ
    private CountDownLatch waitRunTag;// ȴ
    private CountDownLatch beginTag;//
    private CountDownLatch endTag;// ˶Այ

    public MyThread(CountDownLatch comingTag, CountDownLatch waitTag,
                    CountDownLatch waitRunTag, CountDownLatch beginTag,
                    CountDownLatch endTag) {
        super();
        this.comingTag = comingTag;
        this.waitTag = waitTag;
        this.waitRunTag = waitRunTag;
        this.beginTag = beginTag;
        this.endTag = endTag;
    }

    @Override
    public void run() {
        try {
            System.out.println("˶Աʹò߲ͬͨͬٶȵܵ㣬ͷߣ");
            Thread.sleep((int) (Math.random() * 10000));
            System.out.println(Thread.currentThread().getName() + "ܵˣ");
            comingTag.countDown();
            System.out.println("ȴ˵׼");
            waitTag.await();
            System.out.println("͸λ׼ƣ");
            Thread.sleep((int) (Math.random() * 10000));
            waitRunTag.countDown();
            beginTag.await();
            System.out.println(Thread.currentThread().getName()
                    + " Ա ʱȷ");
            Thread.sleep((int) (Math.random() * 10000));
            endTag.countDown();
            System.out.println(Thread.currentThread().getName() + " Այ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
