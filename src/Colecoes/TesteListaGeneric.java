package Colecoes;

import java.util.ArrayList;

public class TesteListaGeneric {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Manoel");
        lista.add("James");
        lista.add("Claudia");

        for (int i = 0; i < lista.size(); i++) {
            String nome = lista.get(i);
            System.out.println(nome);
        }
        System.out.println("------------------------");
        lista.remove(0); //remove Manoel da lista por ocupar a posição zero
        lista.remove("Claudia"); //remove o elemento Claudia da lista

        System.out.println(lista);
    }
}
