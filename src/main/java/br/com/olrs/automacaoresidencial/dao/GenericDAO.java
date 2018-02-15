package br.com.olrs.automacaoresidencial.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.olrs.automacaoresidencial.model.Estado;
import br.com.olrs.automacaoresidencial.util.HibernateUtil;

public class GenericDAO<Entidade> {

	private Class<Entidade> classe;
	
	@SuppressWarnings("unchecked")
	public GenericDAO() {
		/*
		 * getClass() - > Pega a classe atual recebida na entidade --> Exemplo: -> EstadoDAO(),
		 * getGenericSuperclass() - > Pega o super tipo genérico (superClass genérica) --> Exemplo: -> (GenericDAO<Estado>)
		 * getActualTypeArguments()[0] -> Pega o classe do tipo: Exemplo: -> (Neste caso o EStado())....
		 * */
		 
		this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void salvar(Entidade entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.save(entidade);
			transacao.commit();
			
		}catch (RuntimeException re) {
			if(transacao != null) {
				transacao.rollback();
			}
			throw re;
		}finally {
			sessao.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Entidade> listar(){
		
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		
		try {
			
			Criteria consulta = sessao.createCriteria(classe);
			List<Entidade> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException re) {
			
			throw re;
		}finally {
			sessao.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public Entidade buscar(Long codigo) {
		
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			
			Criteria consulta = sessao.createCriteria(classe);
			consulta.add(Restrictions.idEq(codigo));
			Entidade resultado = (Entidade) consulta.uniqueResult();
			return resultado;
			
		} catch (RuntimeException  re) {

			throw re;
			
		}finally {
			
			sessao.close();
		}
	}
	
	public void deletar (Entidade entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(entidade);
			transacao.commit();
			
		}catch (RuntimeException re) {
			if(transacao != null) {
				transacao.rollback();
			}
			throw re;
		}finally {
			sessao.close();
		}
	}
	
	public void editar (Entidade entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.update(entidade);
			transacao.commit();
			
		}catch (RuntimeException re) {
			if(transacao != null) {
				transacao.rollback();
			}
			throw re;
		}finally {
			sessao.close();
		}
	}
}
