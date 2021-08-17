package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Rede {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(String nomeFuncionario, String nomeLoja, String bairro) {
        Loja loja = LojaFactory.getLoja(nomeLoja, bairro);
        Funcionario funcionario = new Funcionario(nomeFuncionario, loja);
        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios() {
        List<String> saida = new ArrayList<String>();
        for (Funcionario funcionario : this.funcionarios) {
            saida.add(funcionario.obterFuncionario());
        }
        return saida;
    }


}
