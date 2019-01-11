package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test21 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        list.remove(1);// ɾı
        list.remove(2);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
