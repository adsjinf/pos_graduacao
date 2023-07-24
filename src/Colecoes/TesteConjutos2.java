package Colecoes;

import java.util.TreeSet;

public class TesteConjutos2 {
    public static void main(String[] args) {
        TreeSet<String> nomes = new TreeSet<String>();

        System.out.println(nomes.add("Emanoel"));
        System.out.println(nomes.add("Bernardo"));
        System.out.println(nomes.add("Carlos"));
        System.out.println(nomes.add("Benedido"));
        System.out.println(nomes.add("Emanoel"));
        System.out.println("----------------------");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
