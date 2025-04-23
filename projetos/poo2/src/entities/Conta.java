package entities;

public class Conta {

	private int numConta;
	private String name;
	private double saldo;

	public Conta(int numConta, String name) {
		this.numConta = numConta;
		this.name = name;
	}

	public Conta(int numConta, String name, double depositoInicial) {
		this.numConta = numConta;
		this.name = name;
		deposito(depositoInicial);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}

	public void saque(double quantia) {
		saldo -= quantia + 5;
	}

	public String toString() {
		return "Conta " +
				numConta +
				", Nome: " +
				name + 
				", Saldo: $" +
				String.format("%.2f", saldo);
				
	}

}
