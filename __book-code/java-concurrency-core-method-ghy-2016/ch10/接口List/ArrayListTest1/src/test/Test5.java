package test;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("й1");
        list.add("й2");
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }
}
