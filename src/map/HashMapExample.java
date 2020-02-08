package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> galeraIdade = new HashMap<>();

        galeraIdade.put("Alan", 30);
        galeraIdade.put("Leticia", 24);
        galeraIdade.put("Amanda", 28);
        galeraIdade.put("Jonata", 19);
        galeraIdade.put("Djow", 21);
        galeraIdade.put("Naiara", 21);

        System.out.println("\nImprimindo pessoas do conjunto e suas idades:\n" +
                galeraIdade);

        //Atualizando a idade da Amanda
        galeraIdade.put("Amanda", 32);

        System.out.println("\nAtualizando a idade e buscando por Amanda:\n" +
                galeraIdade.get("Amanda"));

        //Retorna se o elemento chave (nomes) está no conjunto
        System.out.println("\nRetorna se o elemento chave (Alan) está na lista:\n" +
                galeraIdade.containsKey("Alan"));

        //Retorna se existe um valor x no conjunto
        System.out.println("\nRetorna se existe um valor (idade) 21 no conjunto:\n" +
                galeraIdade.containsValue(21));

        // Retorna tamanho do conjunto
        System.out.println("\nRetorna tamanho do conjunto:\n" + galeraIdade.size());

        //Percorrendo o conjunto com Entry
        System.out.println("\nPercorrendo a lista:");
        for (Map.Entry<String, Integer> entry : galeraIdade.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Percorrendo conjunto com KeySet
        System.out.println("\nPercorrendo conjunto com KeySet:");
        for (String key : galeraIdade.keySet()) {
            System.out.println(key + ": " + galeraIdade.get(key));
        }

        System.out.println("\nTamanho do conjunto:\n" + galeraIdade.size());
        galeraIdade.clear();
        System.out.println("\nTamanho do conjunto após limpeza:\n" + galeraIdade.size());
    }
}
