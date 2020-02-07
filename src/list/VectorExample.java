package list;

public class VectorExample {
    public static void main(String[] args) {
        java.util.List<String> galera = new java.util.Vector<>();

        galera.add("Joao");
        galera.add("Guilherme");
        galera.add("Almeida");
        galera.add("Campos");
        galera.add("Livia");
        galera.add("Ana");

        System.out.println("\nLista atual:\n" + galera);
        galera.set(2, "Jonatá");
        System.out.println("\nSubstituindo pessoa com indice 2 (3 posição) por Jonatá:\n" + galera);

        galera.remove("Ana");
        System.out.println("\nRemovendo objeto 'Ana':\n" + galera);

        galera.remove(3);
        System.out.println("\nRemovendo por indice 3 (4 posicao):\n" + galera);

        System.out.println("\nPercorrendo a lista com forEach:");
        for (String pessoa: galera){
            System.out.println(pessoa);
        }
    }
}
