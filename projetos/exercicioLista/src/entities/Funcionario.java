package entities;

public class Funcionario {

	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public void aumentarSalario (double porcentagem) {
		salary += salary * porcentagem / 100.0;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
	
	
}
