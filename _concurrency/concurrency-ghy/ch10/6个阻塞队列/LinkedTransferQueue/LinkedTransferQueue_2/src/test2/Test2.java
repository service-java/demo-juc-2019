package test2;

public class Test2 {

    public static void main(String[] args) {
        try {
            MyServiceB service = new MyServiceB();

            ThreadB2 b = new ThreadB2(service);
            b.setName("b");
            b.start();

            Thread.sleep(3000);

            System.out.println("еԪظΪ" + service.queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
