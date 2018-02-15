package br.com.olrs.automacaoresidencial.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

//import br.com.automacao.model.GenericDomain;

@SuppressWarnings("serial")
@Entity
@XmlRootElement
public class Cliente extends GenericDomain {

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Column(nullable = false)
	private Boolean ativado;
	
	//@OneToOne indica que uma pessoa só pode ter um cadastro no sistema...
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Login login;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Endereco endereco;
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Boolean getAtivado() {
		return ativado;
	}
	public void setAtivado(Boolean ativado) {
		this.ativado = ativado;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	
}
