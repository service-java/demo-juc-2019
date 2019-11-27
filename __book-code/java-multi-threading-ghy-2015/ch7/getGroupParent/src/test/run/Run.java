package test.run;

public class Run {

    public static void main(String[] args) {
        System.out.println("̣߳" + Thread.currentThread().getName()
                + " ڵ߳Ϊ"
                + Thread.currentThread().getThreadGroup().getName());
        System.out
                .println("main߳ڵ߳ĸ߳ǣ"
                        + Thread.currentThread().getThreadGroup().getParent()
                        .getName());
        System.out.println("main߳ڵ߳ĸ߳ĸ߳ǣ"
                + Thread.currentThread().getThreadGroup().getParent()
                .getParent().getName());
    }

}
