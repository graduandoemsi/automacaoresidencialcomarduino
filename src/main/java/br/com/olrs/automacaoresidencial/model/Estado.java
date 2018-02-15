package br.com.olrs.automacaoresidencial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

//Entity para indicar que a classe terá uma tabela equivalente no banco de dados
@SuppressWarnings("serial")
@Entity
@XmlRootElement
public class Estado extends GenericDomain {

	//Column para indicar o tamanho da palavra 
	//nullabre para fazer o ítem not null ou not null, neste caso como sendo falso indica que não pode ser nulo
	
	@Column(length = 2, nullable = false)
	private String sigla;
	
	@Column(length = 30, nullable = false)
	private String nome;
	
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
