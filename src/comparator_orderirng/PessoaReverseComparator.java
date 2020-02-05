package comparator_orderirng;

import comparator_orderirng.Pessoa;

import java.util.Comparator;

public class PessoaReverseComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa pessoa, Pessoa t1) {
        return t1.getIdade() - pessoa.getIdade();
    }
}
