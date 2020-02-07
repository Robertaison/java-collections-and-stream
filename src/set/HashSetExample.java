package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        //Metodos proximo a interface list, porem não garante a ordem em que foi inserido
        Set<Integer> idades = new HashSet<>();

        idades.add(15);
        idades.add(18);
        idades.add(22);
        idades.add(12);
        idades.add(27);

        System.out.println("\nLista de idades (Sem garantia de ordem de inserção):\n" + idades);

        idades.remove(22);

        System.out.println("\nLista de idades após  remoção:\n" + idades);

        Iterator iterator = idades.iterator();

        //Percorrendo conjunto com iterator
        System.out.println("\nPercorrendo conjunto com iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Percorrendo conjunto com forEach
        System.out.println("\nPercorrendo conjunto com forEach");
        for (Integer idade: idades){
            System.out.println(idade);
        }

        System.out.println("\nNumero de elementos:\n" + idades.size());
        idades.clear();
        System.out.println("\nNumero de elementos depois do clear:\n" + idades.size());

        System.out.println("\nLista limpa:\n" + idades);
    }
}
