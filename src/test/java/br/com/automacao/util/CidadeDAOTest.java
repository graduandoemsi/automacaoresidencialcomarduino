package br.com.automacao.util;

import org.junit.Ignore;
import org.junit.Test;

import br.com.olrs.automacaoresidencial.dao.CidadeDAO;
import br.com.olrs.automacaoresidencial.dao.EstadoDAO;
import br.com.olrs.automacaoresidencial.model.Cidade;
import br.com.olrs.automacaoresidencial.model.Estado;

public class CidadeDAOTest {

	@Test
	//@Ignore
	public void salvar() {
		
		EstadoDAO estadoDAO = new EstadoDAO();
		
		Estado estado = estadoDAO.buscar(1L);
		
		Cidade cidade = new Cidade();
		
		cidade.setEstado(estado);
		cidade.setNome("Varginha");
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
		
	}
}
