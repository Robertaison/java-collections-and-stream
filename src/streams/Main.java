package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> galera = new ArrayList<>();

        galera.add("Bere");
        galera.add("Fulano");
        galera.add("Alex");
        galera.add("Jow");
        galera.add("Olivereira");
        galera.add("Mario");
        galera.add("Cleber");

        //Retornar contagem de elementos
        System.out.println("\nNumero de pessoas: \n" +
                galera.stream().count());

        //Retornar elemento com maior numero de letras
        System.out.println("\nPessoa com maior nome: \n" +
                galera.stream().max(Comparator.comparingInt(String::length)));

        //Retornar elemento com menor numero de letras
        System.out.println("\nPessoa com menor nome: \n" +
                galera.stream().min(Comparator.comparingInt(String::length)));

        //Retornar nome que possui a letra r
        System.out.println("\nPessoas com r no nome: \n" +
                galera.stream().filter((pessoa) -> pessoa.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retornar uma nova coleção, com nomes concatenado a sua quantidade de letra
        System.out.println("\nPessoas e numero de letras em seus nomes: \n" +
                galera.stream().map(pessoa -> pessoa.concat(" - ").concat(String.valueOf(pessoa.length()))).collect(Collectors.toList()));

        //Retornar os 3 primeiros elemetos da colleção
        System.out.println("\n3 primeiros nomes da lista: \n" +
                galera.stream().limit(3).collect(Collectors.toList()));

        //Imprime cada pessoa da lista e retorna a lista toda
        System.out.println("\nImprindo cada pessoa na lista e a lista inteira: ");
        System.out.println(galera.stream().peek(System.out::println).collect(Collectors.toList()));

        //Imprime cada pessoa da lista, sem imprimir a lista
        System.out.println("\nImprimindo cada pessoa da lista:");
        galera.stream().forEach(System.out::println);

        //Retorna true se todos elementos tiverem r
        System.out.println("\nVerificando se algum nome possui letra r:\n" +
                galera.stream().allMatch((elemento) -> elemento.contains("r")));

        //Retorna true se algum elemento tiver r
        System.out.println("\nRetorna true se algum elemento tiver r:\n" +
                galera.stream().anyMatch((elemento) -> elemento.contains("r")));

        //Retorna primeiro elemento da colecao, se existir exibe
        System.out.println("\nRetorna primeiro elemento da colecao, se existir exibe:");
        galera.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operacao encadeada
        System.out.println("\nOperacao encadeada:");
        System.out.println(
                galera.stream()
                        .peek(System.out::println)
                        .map(pessoa -> pessoa.concat(" ## ").concat(String.valueOf(pessoa.length())))
                        .peek(System.out::println)
                        .filter((pessoa) -> pessoa.toLowerCase().contains("r"))
//                        .collect(Collectors.toList())
                        .collect(Collectors.joining(", "))
//                        .collect(Collectors.toSet())
//                        .collect(Collectors.groupingBy(pessoa -> pessoa.substring(pessoa.indexOf(" = ") +1)))

        );
    }
}
