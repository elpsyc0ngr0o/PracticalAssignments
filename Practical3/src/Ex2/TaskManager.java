package Ex2;

public class TaskManager {
        public void performTask(String CurrentThread, int CurrentID) {

            System.out.println(CurrentThread);
            System.out.println(CurrentID);

            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(CurrentThread);
            System.out.println(CurrentID);

        }
}
