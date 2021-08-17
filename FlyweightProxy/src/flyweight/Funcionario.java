package flyweight;

public class Funcionario {

    private String nome;
    private Loja lojaOrigem;

    public Funcionario(String nome, Loja lojaOrigem) {
        this.nome = nome;
        this.lojaOrigem = lojaOrigem;
    }

    public String obterFuncionario() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", loja='" + lojaOrigem.getNome() + '\'' +
                ", bairro='" + lojaOrigem.getBairro() + '\'' +
                '}';
    }
}
