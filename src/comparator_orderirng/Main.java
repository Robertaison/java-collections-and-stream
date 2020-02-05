package comparator_orderirng;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Lista
        List<Pessoa> osCara = new ArrayList<>();

        osCara.add(new Pessoa(12, "Jose"));
        osCara.add(new Pessoa(2, "ale"));
        osCara.add(new Pessoa(62, "bere"));
        osCara.add(new Pessoa(17, "tere"));
        osCara.add(new Pessoa(54, "rose"));
        osCara.add(new Pessoa(28, "moste"));

        System.out.println("\nPadrao\n" + osCara);

        osCara.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("\nOrdem natural lambda function\n" + osCara);

        osCara.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("\nOrdem reversa lambda function\n" + osCara);

        //Comparator
        osCara.sort(Comparator.comparingInt(Pessoa::getIdade));
        System.out.println("\nOrdem natural (method reference)\n" + osCara);

        osCara.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        System.out.println("\nOrdem natural (method reference)\n" + osCara);

        //Collections
        Collections.sort(osCara);
        System.out.println("\nOrdem natural (interface Comparable)\n" + osCara);

        Collections.sort(osCara, new PessoaReverseComparator());
        System.out.println("\nOrdem reversa (interface Comparator\n" + osCara);

    }
}
