package models;

public class User {

	private Integer id;
	private String email;
	private String password;
	private String phone_number;
	private String cpf;
	private Endereco endereco;
	
	public User() {
		
	}

	public User(Integer id, String email, String password, String phone_number, String cpf, Endereco endereco) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.phone_number = phone_number;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public boolean login (String email, String password) {
		
	}
	
	public void updateProfile(String newEmail, String newPhone) {
		email = newEmail;
		phone_number = newPhone;
	}
	
	public String getAddress() {
		return endereco.toString();
	}
	
}
