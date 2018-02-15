package br.com.olrs.automacaoresidencial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@Entity
@XmlRootElement
public class Endereco extends GenericDomain{

	@Column(length = 100, nullable = false)
	private String rua;
	
	@Column(length = 100, nullable = false)
	private String bairro;
	
	@Column(length = 9, nullable = false)
	private String cep;
	
	@Column(length = 10, nullable = true)
	private int numero;
	
	@Column(length = 100, nullable = true)
	private String complemento;
	
	@ManyToOne
	//para personalizar as propriedades das colunas que são chaves estrangeiras
	@JoinColumn(nullable = false)
	//@Column(length = 100)
	private Cidade cidade;
	/*
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	*/
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
