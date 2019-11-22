package extthread;

public class RunThread extends Thread {

    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("run");
        while (isRunning == true) {
        }
        System.out.println("ֹ̱߳ͣˣ");
    }

}
