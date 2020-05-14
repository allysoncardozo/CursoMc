package com.cursomc.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.cursomc.abstratos.ABase;

@Entity
public class Produto extends ABase<Produto> {
	
	private static final long serialVersionUID = 1L;
	
	private String Nome;
	private Double Preco;
	
	@ManyToMany
	@JoinTable(name = "PRODUTO_X_CATEGORIA",
		joinColumns =  @JoinColumn(name = "produto_id"),
		inverseJoinColumns = @JoinColumn(name = "categoria_id")
	)
	private List<Categoria> Categorias = new ArrayList<Categoria>();
	
	public Produto(){
		
	}

	public Produto(Integer id, String nome, Double preco) {
		super();
		super.setId(id);
		Nome = nome;
		Preco = preco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public List<Categoria> getCategorias() {
		return Categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		Categorias = categorias;
	}



	
}
