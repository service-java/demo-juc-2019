package test.run;

public class Run {

    public static void main(String[] args) {

        // mainһ߳AȻA̶߳Z
        // activeGroupCount()activeCount()ֵǹ̶
        // ϵͳлһ
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup, "A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("runMethod!");
                    Thread.sleep(10000);// ̱߳״̬ſ
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread newThread = new Thread(group, runnable);
        newThread.setName("Z");
        newThread.start();// ̱߳ȻŹ鵽A
        // ///
        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread()
                .getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);
        System.out.println("main߳жٸ߳飺" + listGroup.length + " Ϊ"
                + listGroup[0].getName());
        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println(listThread[0].getName());

    }

}
