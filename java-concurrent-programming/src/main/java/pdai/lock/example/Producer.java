package pdai.lock.example;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 10:06
 */
public class Producer {
    private Depot depot;
    public Producer(Depot depot) {
        this.depot = depot;
    }

    public void produce(int no) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                depot.produce(no);
            }
        }, no + " produce thread").start();
    }
}
