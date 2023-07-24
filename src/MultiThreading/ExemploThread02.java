package MultiThreading;

public class ExemploThread02 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i=0; i < 20; i++) {
                System.out.print("y");
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
