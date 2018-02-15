package br.com.olrs.automacaoresidencial.main;

import org.hibernate.Session;

import br.com.olrs.automacaoresidencial.model.Pessoa;
import br.com.olrs.automacaoresidencial.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		
		/*Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Elis");

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		
		sessao.beginTransaction();
		sessao.save(pessoa);

		sessao.getTransaction().commit();
		sessao.close();
		*/
		//HibernateUtil.getFabricaDeSessoes().close();
		
	}

}
