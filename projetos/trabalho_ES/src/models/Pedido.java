package models;

public class Pedido {

	private Integer id;
	private User user_id;
	private Endereco endereco_id;
	private Pagamento pagamento_id;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, User user_id, Endereco endereco_id, Pagamento pagamento_id) {
		this.id = id;
		this.user_id = user_id;
		this.endereco_id = endereco_id;
		this.pagamento_id = pagamento_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public Endereco getEndereco_id() {
		return endereco_id;
	}

	public void setEndereco_id(Endereco endereco_id) {
		this.endereco_id = endereco_id;
	}

	public Pagamento getPagamento_id() {
		return pagamento_id;
	}

	public void setPagamento_id(Pagamento pagamento_id) {
		this.pagamento_id = pagamento_id;
	}
	
	public void addItem (Produto produto, int quantidade) {
		
	}
	
	public Double calculateTotal() {
		
	}
	
	public void finalizeOrder() {
		
	}
	
}
