package br.com.automacao.util;

import org.hibernate.Session;
import org.junit.Test;

import br.com.olrs.automacaoresidencial.util.HibernateUtil;

public class HibernateutilTest {

	@Test
	public void conectar() {
		
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}
