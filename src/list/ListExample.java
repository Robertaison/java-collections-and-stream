package list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {
    public static void main(String[] args) {
        java.util.List<String> galera = new ArrayList<>();

        galera.add("Joao");
        galera.add("Guilherme");
        galera.add("Almeida");
        galera.add("Campos");
        galera.add("Livia");
        galera.add("Ana");

        System.out.println("\nLista:\n" + galera);

        System.out.println("\nTamanho da lista:\n" + galera.size());

        System.out.println("\nBuscando por indice 0 (1 posicao):\n" + galera.get(0));

        System.out.println("\nRetorna verdadeiro ou falso caso contenha o pesquisado (Ana):\n" + galera.contains("Ana"));

        System.out.println("\nRetorna verdadeiro ou falso caso contenha o pesquisado (Olavo):\n" + galera.contains("Olavo"));

        galera.set(2, "Jonatá");
        System.out.println("\nSubstituindo pessoa com indice 2 (3 posição) por Jonatá:\n" + galera);

        System.out.println("\nIndex do Jonatá:\n" + galera.indexOf("Jonatá"));

        System.out.println("\nIndex do Wesley:\n" + galera.indexOf("Wesley"));

        Collections.sort(galera);
        System.out.println("\nOrganizando lista por ordem alfabética:\n" + galera);

        galera.remove("Ana");
        System.out.println("\nRemovendo objeto 'Ana':\n" + galera);

        galera.remove(3);
        System.out.println("\nRemovendo por indice 3 (4 posicao):\n" + galera);

        galera.clear();
        System.out.println("\nLista limpa:\n" + galera);

        System.out.println("\nVerificar se a lista esta limpa:\n" + galera.isEmpty());
    }
}
