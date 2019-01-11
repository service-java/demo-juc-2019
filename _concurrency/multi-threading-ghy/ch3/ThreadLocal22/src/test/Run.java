package test;

import ext.ThreadLocalExt;

public class Run {
    public static ThreadLocalExt tl = new ThreadLocalExt();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("δŹֵ");
            tl.set("ҵֵ");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }

}
