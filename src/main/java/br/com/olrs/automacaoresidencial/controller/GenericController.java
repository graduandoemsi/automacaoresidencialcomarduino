package br.com.olrs.automacaoresidencial.controller;

import java.lang.reflect.ParameterizedType;

import com.google.gson.Gson;

import br.com.olrs.automacaoresidencial.model.Pessoa;

public class GenericController<Entidade> {

	private Class<Entidade> classe;
	
	public GenericController() {
		
		this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void salvar() {
		
		
	}
}
