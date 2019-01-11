package test2;

public class Test2 {

    public static void main(String[] args) {
        try {
            MyServiceB service = new MyServiceB();

            ThreadB1 a = new ThreadB1(service);
            a.setName("a");

            a.start();
            Thread.sleep(4000);
            System.out.println("дСΪ" + service.queue.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
