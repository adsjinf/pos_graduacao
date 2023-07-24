package MultiThreading;

public class TesteThread05 {
    public static void main(String[] args) {
        ExemploPrioridades ep = new ExemploPrioridades();
        Thread t1 = new Thread(ep, "t1");
        Thread t2 = new Thread(ep, "t2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
