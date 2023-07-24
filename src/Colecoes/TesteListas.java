package Colecoes;

import java.util.ArrayList;

public class TesteListas {
    public static void main(String[] arqs){
        ArrayList nomes = new ArrayList();
        nomes.add("Emilio1");
        nomes.add("Pablito1");
        nomes.add("louro1");
        nomes.add(1000);

        for (int i=0; i < nomes.size(); i++) {
            if (nomes.get(i) instanceof String) {
                String nome = (String)nomes.get(i);
                System.out.println(nome);
            }
        }

        ArrayList<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Emilio2");
        listaNomes.add("Pablito2");
        listaNomes.add("louro2");
        listaNomes.add("1000");
        for (String listanome : listaNomes) {
            System.out.println(listanome);
        }

    }
}