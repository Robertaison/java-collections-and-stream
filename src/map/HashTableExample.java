package map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {

        Hashtable<String, Integer> galeraIdade = new Hashtable<>();

        galeraIdade.put("Alan", 30);
        galeraIdade.put("Leticia", 24);
        galeraIdade.put("Amanda", 28);
        galeraIdade.put("Jonata", 19);
        galeraIdade.put("Djow", 21);
        galeraIdade.put("Naiara", 21);

        System.out.println("\nImprimindo a coleção:\n" +
                galeraIdade);

        galeraIdade.put("Pedro", 55);

        System.out.println("\nImprimindo condição atual da coleção:\n" +
                galeraIdade);

        //Remove de acordo com valor da chave
        galeraIdade.remove("Pedro");

        System.out.println("\nImprimindo coleção após remoção do Pedro:\n" +
                galeraIdade);

        //Buscando valor da chave por indice
        int idade = galeraIdade.get("Naiara");

        System.out.println("\nImprimindo retorno de busca na coleção por nome (Naiara):\n" +
                idade);

        System.out.println("\nImprimindo o tamanho da coleção\n:" +
                galeraIdade.size());

        //Percorrendo a coleção
        System.out.println("\nPrimeiro modo:");
        for (Map.Entry<String, Integer> entry: galeraIdade.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("\nSegundo modo:");
        for (String key: galeraIdade.keySet()) {
            System.out.println(key + " // " + galeraIdade.get(key));
        }
    }
}
