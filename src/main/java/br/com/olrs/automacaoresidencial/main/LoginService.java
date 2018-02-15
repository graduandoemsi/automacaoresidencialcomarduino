package br.com.olrs.automacaoresidencial.main;

import br.com.olrs.automacaoresidencial.dao.LoginDAO;
import br.com.olrs.automacaoresidencial.model.Login;

//Não preciso desta classe ***************************************
public class LoginService {
	
	public Login getDefaultLogin() {
		
		LoginDAO loginDAO = new LoginDAO();
		Login login = loginDAO.buscar(1L);
		
		String cliente = login.getLogin();
		System.out.println("Login: " + cliente);
		
		return login;

	}

}
