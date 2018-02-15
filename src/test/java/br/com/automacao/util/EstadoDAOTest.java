package br.com.automacao.util;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.olrs.automacaoresidencial.dao.EstadoDAO;
import br.com.olrs.automacaoresidencial.model.Estado;

public class EstadoDAOTest {

	@Test
	@Ignore
	public void salvar() {
		
		Estado estado = new Estado();
		estado.setNome("Rio de Janeiro");
		estado.setSigla("RJ");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
		
		
	}
	
	@Test
	@Ignore
	public void listar() {
		
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		
		System.out.println("Total des registros encontrados: " + resultado.size());
		for(Estado estado : resultado) {
			
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 3L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		if(estado == null) {
			System.out.println("Registro não encontrado");
			
		}else {
			System.out.println("Registro encontrado");
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		}
	}
	
	@Test
	@Ignore
	public void deletar() {
		
		Long codigo = 5L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado == null) {
			System.out.println("Registro não encontrado");
			
		}else {
			estadoDAO.deletar(estado);
			System.out.println("Registro removido");
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		}
		
	}
	
	
}
