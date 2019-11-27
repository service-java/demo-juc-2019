package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test26 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("b");

        List newList = list.subList(2, 5);

        Iterator iterator = newList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
