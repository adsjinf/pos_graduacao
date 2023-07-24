package MultiThreading;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.ThreadLocalRandom;

public class TesteThread03 {
    public static void main(String[] args) {
        ExemploThreadRunnable02 tr = new ExemploThreadRunnable02();
        //Definindo o nome do thread como parâmentro do construtor
        Thread t = new Thread(tr,"thread_pessoal");
        //trocando o nome da thread_pessoal pelo novo_nome
        t.setName("novo_nome");
        t.start();
        String nome = Thread.currentThread().getName();
        System.out.println("Nome do thread principal : " + nome);
    }
}
