package br.com.olrs.automacaoresidencial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

//import br.com.automacao.domain.GenericDomain;

@SuppressWarnings("serial")
@Entity
@XmlRootElement
public class Login extends GenericDomain{

	@Column(length = 100, nullable = false)
	private String login;
	
	@Column(length = 30, nullable = false)
	private String senha;
	
	/*
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	*/
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/*
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	*/
}
