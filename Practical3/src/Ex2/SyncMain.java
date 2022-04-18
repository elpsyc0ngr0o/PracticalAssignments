package Ex2;

public class SyncMain {
    public static void sleepThread(){
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SyncMain syncmain = new SyncMain();
        final TaskManager taskmanager = new TaskManager();
        Thread taskThread1 = new TaskThread("Thread1", 1, taskmanager);
        Thread taskThread2 = new TaskThread("Thread2", 2, taskmanager);
        Thread taskThread3 = new TaskThread("Thread3", 3, taskmanager);

        taskThread1.start();
        SyncMain.sleepThread();

        taskThread2.start();
        SyncMain.sleepThread();

        taskThread3.start();
        SyncMain.sleepThread();


    }
}
