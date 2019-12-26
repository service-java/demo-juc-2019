package tech.pdai.basics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-21 15:48
 */
public class UnmodifiableMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        unmodifiableMap.put("a", 1); // java.lang.UnsupportedOperationException
    }
}
