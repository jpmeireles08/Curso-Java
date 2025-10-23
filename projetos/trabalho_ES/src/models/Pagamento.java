package models;

public class Pagamento {
	private Integer id;
	private Pedido pedido_id;
	private Produto produto_id;
	private Integer quantidade;
	
	public Pagamento () {
		
	}

	public Pagamento(Integer id, Pedido pedido_id, Produto produto_id, Integer quantidade) {
		this.id = id;
		this.pedido_id = pedido_id;
		this.produto_id = produto_id;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pedido getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Pedido pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Produto getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Produto produto_id) {
		this.produto_id = produto_id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
