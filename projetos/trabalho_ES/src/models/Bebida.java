package models;

public class Bebida extends Produto{

	private Produto produto_id;
	private Integer id;
	private String tamanho;
	
	public Bebida() {
		
	}

	public Bebida(Produto produto_id, Integer id, String tamanho) {
		this.produto_id = produto_id;
		this.id = id;
		this.tamanho = tamanho;
	}

	public Produto getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Produto produto_id) {
		this.produto_id = produto_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setSize (String newSize) {
		tamanho = newSize;
	}
	
	public String getBeverageDetails() {
		return this.getNome() + ", " + this.getPreco() +
			", " + this.getObservacao();
	}
	
}
