package br.com.automacao.util;

import org.junit.Ignore;
import org.junit.Test;

import br.com.olrs.automacaoresidencial.dao.PessoaDAO;
import br.com.olrs.automacaoresidencial.model.Pessoa;

public class PessoaDAOTest {
	
	@Test
	//@Ignore
	public void salvar() {
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Souza");
		pessoa.setCpf("550");
		pessoa.setCelular("7180");
		pessoa.setEmail("ru-bem");
		pessoa.setRg("39");
		
		pessoaDAO.salvar(pessoa);
		
		System.out.println("Cadastro salvo com sucesso!");
		
	}

}
