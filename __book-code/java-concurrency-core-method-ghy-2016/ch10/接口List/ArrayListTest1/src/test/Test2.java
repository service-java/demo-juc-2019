package test;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("й1");
        list.add("й2");
        list.add(1, "ǵڶλ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
