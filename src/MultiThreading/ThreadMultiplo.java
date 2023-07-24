package MultiThreading;

public class ThreadMultiplo implements Runnable {
    public void run() {
        try {
            String nome = Thread.currentThread().getName();
            for (int i=0;i<5;i++) {
                System.out.println("Thread: " + nome + ", posição " + i);
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
