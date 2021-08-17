package flyweight;

public class Loja {

    private String nome;
    private String bairro;

    public Loja(String nome, String bairro) {
        this.nome = nome;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public String getBairro() {
        return bairro;
    }
}
