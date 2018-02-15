package br.com.olrs.automacaoresidencial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@Entity
@XmlRootElement
public class Cidade extends GenericDomain {

	@Column(length = 50, nullable = false)
	private String nome;
	
	@ManyToOne
	//para personalizar as propriedades das colunas que são chaves estrangeiras
	@JoinColumn(nullable = false)
	private Estado estado;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
