package com.cursomc.domain;

import javax.persistence.Entity;

import com.cursomc.abstratos.ABase;

@Entity
public class Categoria extends ABase<Categoria> {
	
	private static final long serialVersionUID = 1L;
	
	private String Nome;
	
	public Categoria(){
		
	}

	public Categoria(Integer id, String nome) {
		super();
		super.setId(id);
		Nome = nome;
	}


	public String getNome() { return Nome; 	}

	public void setNome(String nome) { Nome = nome; }
}
