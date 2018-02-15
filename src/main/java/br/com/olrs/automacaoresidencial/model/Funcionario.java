package br.com.olrs.automacaoresidencial.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

//import br.com.automacao.domain.GenericDomain;

@SuppressWarnings("serial")
@Entity
@XmlRootElement
public class Funcionario extends GenericDomain{

	@OneToOne
	@JoinColumn(nullable = false)
	private Login login;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Endereco endereco;
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
