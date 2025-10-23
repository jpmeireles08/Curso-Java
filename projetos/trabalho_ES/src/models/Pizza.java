package models;

public class Pizza extends Produto {

	private Produto id_produto;
	private Integer id;
	private char tamanho;
	
	public Pizza() {
		
	}

	public Pizza(Produto id_produto, Integer id, char tamanho) {
		this.id_produto = id_produto;
		this.id = id;
		this.tamanho = tamanho;
	}

	public Produto getId_produto() {
		return id_produto;
	}

	public void setId_produto(Produto id_produto) {
		this.id_produto = id_produto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setSize(char newSize) {
		tamanho = newSize;
	}
	
	public String getPizzaDetails() {
		return this.getNome() + ", " + this.getPreco() + 
				", " + this.getObservacao();
	}
}
