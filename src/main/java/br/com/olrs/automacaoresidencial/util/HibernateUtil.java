package br.com.olrs.automacaoresidencial.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory fabricaDeSessoes;
	
	public static SessionFactory getFabricaDeSessoes() {
		
		fabricaDeSessoes = criarFabricaDeSessoes();
		
		return fabricaDeSessoes;
	}

	private static SessionFactory criarFabricaDeSessoes() {
		
		try {
			Configuration configuracao = new Configuration().configure();
			
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			
			SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			return fabrica;
			
		} catch (Throwable ex) {
			System.out.println("Não foi possível a criação da fábrica de sessões! " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	//SessionFactory factory = new Configuration().configure().buildSessionFactory();

	//Session session = factory.openSession();

}
