package br.com.automacao.util;

import org.junit.Ignore;
import org.junit.Test;

import br.com.olrs.automacaoresidencial.dao.CidadeDAO;
import br.com.olrs.automacaoresidencial.dao.EnderecoDAO;
import br.com.olrs.automacaoresidencial.model.Cidade;
import br.com.olrs.automacaoresidencial.model.Endereco;

public class EnderecoDAOTest {

	@Test
	//@Ignore
	public void salvar() {
		
		Endereco endereco = new Endereco();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		
		Long codigo = 2L; 
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		
		Cidade cidade = new Cidade();
		cidade = cidadeDAO.buscar(codigo);
		
		endereco.setRua("Rua F");
		endereco.setBairro("PVV");
		endereco.setNumero(55);
		endereco.setCep("37");
		endereco.setComplemento("201");
		endereco.setCidade(cidade);
		
		enderecoDAO.salvar(endereco);
		
		System.out.println("Cadastro salvo com sucesso!");
	}
	

	
}
