package br.com.automacao.util;

import org.junit.Ignore;
import org.junit.Test;

import br.com.olrs.automacaoresidencial.dao.LoginDAO;
import br.com.olrs.automacaoresidencial.model.Login;

public class LoginDAOTest {
	
	@Test
	//@Ignore
	public void salvar() {
		
		Login login = new Login();
		LoginDAO loginDAO = new LoginDAO();
		
		login.setLogin("bem");
		login.setSenha("321");
		
		loginDAO.salvar(login);
		
		System.out.println("Cadastro salvo com sucesso!");
	}


}
