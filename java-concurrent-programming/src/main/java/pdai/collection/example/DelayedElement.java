package pdai.collection.example;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-25 14:21
 */
public class DelayedElement implements Delayed {
    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
