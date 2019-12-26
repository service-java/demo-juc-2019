package geym.conc.ch4.elelock;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.Vector;

public class EleLcok {

    public String[] createStrings() {
        Vector<String> v = new Vector<String>();
        for (int i = 0; i < 100; i++) {
            v.add(Integer.toString(i));
        }
        return v.toArray(new String[]{});
    }

    @Test
    public  void main() {
        String[] strings = createStrings();
        Console.log(strings);
    }

}
