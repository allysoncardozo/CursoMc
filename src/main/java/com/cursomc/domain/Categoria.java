package com.cursomc.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.cursomc.abstratos.ABase;

@Entity
public class Categoria extends ABase<Categoria> {
	
	private static final long serialVersionUID = 1L;
	
	private String Nome;
	
	@ManyToMany(mappedBy="Categorias")
	private List<Produto> Produtos = new ArrayList<Produto>();
	
	public Categoria(){
		
	}

	public Categoria(Integer id, String nome) {
		super();
		super.setId(id);
		Nome = nome;
	}


	public String getNome() { return Nome; 	}

	public void setNome(String nome) { Nome = nome; }

	public List<Produto> getProdutos() {
		return Produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		Produtos = produtos;
	}
}
