package test;

import java.util.ArrayList;

public class Test6 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("й1");
        list.add("й2");

        ArrayList listNew = (ArrayList) list.clone();

        System.out.println(list.hashCode());
        System.out.println(listNew.hashCode());
        for (int i = 0; i < listNew.size(); i++) {
            System.out.println(listNew.get(i));
        }
    }
}
