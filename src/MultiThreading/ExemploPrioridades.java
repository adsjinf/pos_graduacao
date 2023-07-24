package MultiThreading;

public class ExemploPrioridades implements Runnable {
    @Override
    public void run() {
        for (int i=0; i< 20; i++){
            System.out.print(Thread.currentThread().getName());
        }
    }
}
