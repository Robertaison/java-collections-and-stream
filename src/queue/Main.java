package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> galera = new LinkedList<>();

        galera.add("Joao");
        galera.add("Guilherme");
        galera.add("Almeida");
        galera.add("Campos");
        galera.add("Livia");
        galera.add("Ana");

        System.out.println("\nFila atual\n" + galera);

        System.out.println("\nImprimindo sem remover o primeiro elemento da fila:\n" + galera.peek());

        System.out.println("\nFila após\n" + galera);

        System.out.println("\nImprimindo e removendo o primeiro da fila:\n" + galera.poll());

        System.out.println("\nFila após\n" + galera);

        galera.clear();

        System.out.println("\nImprimindo primeiro elemento e caso esteja nullo lançar exceção:\n" + galera.element());
    }
}
