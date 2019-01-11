package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test16 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        list.add("a");

        ListIterator iterator = list.listIterator();
        System.out.println(iterator);
        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " " + iterator.nextIndex());
        }
        System.out.println();
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous() + " "
                    + iterator.previousIndex());
        }
    }
}
