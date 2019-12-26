package geym.conc.ch3.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class SyncHashMap {
        public static Map m= Collections.synchronizedMap(new HashMap());
//    public static Map m = new ConcurrentHashMap();

    public static void main(String[] args) {
        m.put("hello", "world");
    }
}
