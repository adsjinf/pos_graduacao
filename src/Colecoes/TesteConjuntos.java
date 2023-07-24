package Colecoes;

import java.util.HashSet;

public class TesteConjuntos {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<String>();
        nomes.add("Emilio");
        nomes.add("Celso");
        nomes.add("Emilio");

//        for (int i =0; i < nomes.size();i++){
//            System.out.println(nomes);
//        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println(nomes.add("Emanoel"));
        System.out.println(nomes.add("Bernardo"));
        System.out.println(nomes.add("Carlos"));
        System.out.println(nomes.add("Benedido"));
        System.out.println(nomes.add("Emanoel"));
    }
}
