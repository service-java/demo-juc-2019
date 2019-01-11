package test;

public class Run {
    public static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("δŹֵ");
            tl.set("ҵֵ");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }

}
