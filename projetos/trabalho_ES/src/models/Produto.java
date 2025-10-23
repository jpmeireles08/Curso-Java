package models;

import models.enums.Tipo;

public class Produto {
	
	private Integer id;
	private Double preco;
	private String nome;
	private String observacao;
	private Tipo tipo;
	
	public Produto() {
		
	}

	public Produto(Integer id, Double preco, String nome, String observacao, Tipo tipo) {
		this.id = id;
		this.preco = preco;
		this.nome = nome;
		this.observacao = observacao;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
}
