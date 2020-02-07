package list;

import comparator_orderirng.Pessoa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoreWithList {
    public static void main(String[] args) {

        List<String> galera = new ArrayList<>();

        galera.add("Joao");
        galera.add("Guilherme");
        galera.add("Almeida");
        galera.add("Campos");
        galera.add("Livia");
        galera.add("Ana");

        //Maneiras de percorrer a lista
        System.out.println("\nUsando estrutura de for normal");
        for (int i=0; i<galera.size(); i++){
            System.out.println(galera.get(i));
        }

        System.out.println("\nUsando forEach");
        for (String pessoa: galera) {
            System.out.println(pessoa);
        }

        Iterator<String> iterator = galera.iterator();

        System.out.println("\nUtilizando iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
