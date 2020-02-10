package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> galeraIdade = new TreeMap<>();

        galeraIdade.put("Alan", 30);
        galeraIdade.put("Leticia", 24);
        galeraIdade.put("Amanda", 28);
        galeraIdade.put("Jonata", 19);
        galeraIdade.put("Djow", 21);
        galeraIdade.put("Naiara", 21);

        System.out.println("\nImprimindo pessoas do conjunto e suas idades:\n" +
                galeraIdade);

        //Retorna a primeira nome no topo da arvore
        System.out.println("\nRetorna o primeiro nome no topo da arvore:\n" +
                galeraIdade.firstKey());

        //Retorna a ultima nome no fina da arvore
        System.out.println("\nRetorna o ultimo nome no fina da arvore:\n" +
                galeraIdade.lastKey());

        //Retorna o primeiro nome embaixo do parametro
        System.out.println("\nRetorna o primeiro nome acima do parametro:\n" +
                galeraIdade.lowerKey("Leticia"));

        //Retorna o primeiro nome acima do parametro
        System.out.println("\nRetorna o primeiro nome acima do parametro:\n" +
                galeraIdade.higherKey("Leticia"));

        //Retorna o primeiro nome no topo da arvore
        System.out.println("\nRetorna o primeiro nome no topo da arvore:\n" +
                galeraIdade.firstEntry().getKey() + "--" + galeraIdade.firstEntry().getValue());

        //Retorna a ultima nome no fina da arvore
        System.out.println("\nRetorna o ultimo nome no fina da arvore:\n" +
                galeraIdade.lastEntry().getKey() + "--" + galeraIdade.lastEntry().getValue());

        //Retotna primeiro nome abaixo do parametro
        System.out.println("\nRetotna primeiro nome abaixo do parametro\n" +
                galeraIdade.lowerEntry("Leticia").getKey() + "--" + galeraIdade.lowerEntry("Leticia").getValue());

        //Retorna primeiro nome acima do parametro
        System.out.println("\nRetorna primeiro nome acima do parametro\n" +
                galeraIdade.higherEntry("Leticia").getKey() + "--" + galeraIdade.higherEntry("Leticia").getValue());

        Map.Entry<String, Integer> firstEntry = galeraIdade.pollFirstEntry();
        Map.Entry<String, Integer> lastEntry = galeraIdade.pollLastEntry();

        //Retorna o primeiro nome no topo da arvore, removendo do map
        System.out.println("\nRetorna o primeiro nome no topo da arvore:\n" +
                galeraIdade.firstEntry().getKey() + "--" + galeraIdade.firstEntry().getValue());

        //Retorna o ultimo nome no topo da arvore, removendo do map
        System.out.println("\nRetorna o ultimo nome no fina da arvore:\n" +
                galeraIdade.lastEntry().getKey() + "--" + galeraIdade.lastEntry().getValue());

        //Situacao atual do conjunto
        System.out.println(galeraIdade);

        //Percorrendo o map
        Iterator<String> iterator = galeraIdade.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " // " + galeraIdade.get(key));
        }

        for (String nome: galeraIdade.keySet()) {
            System.out.println(nome + " __ " + galeraIdade.get(nome));
        }

        for (Map.Entry<String, Integer> nome: galeraIdade.entrySet()) {
            System.out.println(nome.getKey() + " == " + nome.getValue());
        }
    }
}
