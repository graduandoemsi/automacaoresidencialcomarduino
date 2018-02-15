package br.com.olrs.automacaoresidencial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

//import br.com.automacao.domain.Endereco;
//import br.com.automacao.domain.GenericDomain;

@SuppressWarnings("serial")
@Entity
@XmlRootElement
//@Table(name="aluno",schema="hibernate")
public class Pessoa extends GenericDomain{
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 14, nullable = false)
	private String cpf;
	
	@Column(length = 12, nullable = false)
	private String rg;
	
	@Column(length = 100, nullable = false)
	private String email;
	
	@Column(length = 13, nullable = true)
	private String telefone;
	
	@Column(length = 14, nullable = false)
	private String celular;
	
	/*@ManyToOne
	@JoinColumn(nullable = false)
	private Endereco endereco;
	*/
	/*
	@OneToOne
	@JoinColumn(nullable = false)
	private Login login;
	*/
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	/*
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	*/
	/*
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	*/
	

}
