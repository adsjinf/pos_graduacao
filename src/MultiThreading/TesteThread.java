package MultiThreading;

public class TesteThread {
    public static void main(String[] args) {
//        ExemploThread thread = new ExemploThread();
//        thread.start();

        ExemploThread02 thread2 = new ExemploThread02();
        Thread t = new Thread(thread2);
        t.start();
        try {
            for (int i=0; i < 20; i++) {
                System.out.print(".");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
