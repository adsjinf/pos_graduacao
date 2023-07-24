package MultiThreading;

public class ExemploThread extends Thread {
    public void run(){
        try {
            for (int i=0; i < 40; i++) {
                System.out.print("y");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
