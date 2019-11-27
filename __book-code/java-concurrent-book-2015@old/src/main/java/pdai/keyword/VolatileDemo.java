package pdai.keyword;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-22 14:08
 */

public class VolatileDemo {
    int a = 1;
    int b = 2;

    public void change() {
        a = 3;
        b = a;
    }

    public void print() {
        System.out.println("b=" + b + ";a=" + a);
    }

    public static void main(String[] args) {
        while (true) {
            final VolatileDemo test = new VolatileDemo();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.change();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.print();
                }
            }).start();
        }


        // b=3;a=3 或 b=2;a=1
        // b=3;a=1 还有这种情况
    }
}
