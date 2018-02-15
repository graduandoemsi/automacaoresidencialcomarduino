package br.com.olrs.automacaoresidencial.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlRootElement;

//Com esta anotação, avisamos a IDE para ignorar a não serialização da classe...
@SuppressWarnings("serial")
//Anotação para indicar que esta classe não terá uma tabela equivalente no banco...
@MappedSuperclass
@XmlRootElement
public class GenericDomain implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	
}
