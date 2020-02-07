package set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> idades = new TreeSet<>();

        idades.add(15);
        idades.add(18);
        idades.add(22);
        idades.add(12);
        idades.add(27);

        System.out.println("\nImprimindo a arvore de idades:\n" +
                idades);

        // Retorna capital do topo da arvore
        System.out.println("\nRetorna capital do topo da arvore:\n" +
                idades.first());

        // Retorna a primeira nó abaixo do nó pesquisado
        System.out.println("\nRetorna a primeira nó abaixo do nó pesquisado:\n" +
                idades.higher(18));

        // Retorna a primeira nó acima do nó pesquisado
        System.out.println("\nRetorna a primeira nó abaixo do nó pesquisado:\n" +
                idades.higher(18));

        // Retorna a idade do topo, removendo do conjunto
        System.out.println("\nRetorna a idade do final,removendo do conjunto:\n" +
                idades.pollFirst());

        // Retorna a idade do final,removendo do conjunto
        System.out.println("\nRetorna a idade do final,removendo do conjunto:\n" +
                idades.pollLast());

        System.out.println("\nSituação atual da lista:\n" +
                idades);
    }
}
