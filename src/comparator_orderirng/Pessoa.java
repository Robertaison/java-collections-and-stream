package comparator_orderirng;

public class Pessoa implements Comparable<Pessoa>{
    private int idade;
    private String nome;

    @Override
    public String toString() {
        return "comparator_orderirng.Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.getIdade() - pessoa.getIdade();
    }
}
