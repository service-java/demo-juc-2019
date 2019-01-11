package test2;

public class Test2 {

    public static void main(String[] args) {
        try {
            MyServiceB service = new MyServiceB();

            ThreadB1 a = new ThreadB1(service);
            a.setName("a");
            a.start();

            Thread.sleep(500);

            System.out.println("A дС" + service.queue.size());

            Thread.sleep(8000);

            System.out.println("A дС" + service.queue.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
