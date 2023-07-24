package Colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListaOrdenada {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Manoel");
        lista.add("James");
        lista.add("Claudia");

        Collections.sort(lista);

        for(int i=0;i<lista.size();i++){
            String nome = lista.get(i);
            System.out.println(nome);
        }

        //Forma compacta de um for pára uma lista
        System.out.println("------------------");
        for(String nome : lista) {
            System.out.println(nome);
        }
    }
}
