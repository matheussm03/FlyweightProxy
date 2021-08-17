package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RedeTest {

    @Test
    void deveRetornarListaFuncionarios() {
    	Rede rh = new Rede();
    	rh.cadastrarFuncionario("Marli", "Matriz", "Centro");
    	rh.cadastrarFuncionario("Aparecida", "Matriz", "Centro");
    	rh.cadastrarFuncionario("Daniel", "Filial 1", "Sao Mateus");
    	rh.cadastrarFuncionario("Juliana", "Filial 1", "Sao Mateus");
    	rh.cadastrarFuncionario("Joao", "Filial 2", "Benfica");
    	rh.cadastrarFuncionario("Priscila", "Filial 2", "Benfica");

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Marli', loja='Matriz', bairro='Centro'}",
                "Funcionario{nome='Aparecida', loja='Matriz', bairro='Centro'}",
                "Funcionario{nome='Daniel', loja='Filial 1', bairro='Sao Mateus'}",
                "Funcionario{nome='Juliana', loja='Filial 1', bairro='Sao Mateus'}",
                "Funcionario{nome='Joao', loja='Filial 2', bairro='Benfica'}",
                "Funcionario{nome='Priscila', loja='Filial 2', bairro='Benfica'}");

        assertEquals(saida, rh.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalLojas() {
    	Rede rh = new Rede();
    	rh.cadastrarFuncionario("Marli", "Matriz", "Centro");
    	rh.cadastrarFuncionario("Aparecida", "Matriz", "Centro");
    	rh.cadastrarFuncionario("Daniel", "Filial 1", "Sao Mateus");
    	rh.cadastrarFuncionario("Juliana", "Filial 1", "Sao Mateus");
    	rh.cadastrarFuncionario("Joao", "Filial 2", "Benfica");
    	rh.cadastrarFuncionario("Priscila", "Filial 2", "Benfica");

        assertEquals(3, LojaFactory.getTotalLojas());
    }

}