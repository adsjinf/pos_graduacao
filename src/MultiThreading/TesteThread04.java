package MultiThreading;

public class TesteThread04 {
    public static void main(String[] args) {
        ThreadMultiplo tm = new ThreadMultiplo();

        Thread t1 = new Thread(tm, "João");
        Thread t2 = new Thread(tm, "Maria");

        t1.start();
        t2.start();
    }
}
