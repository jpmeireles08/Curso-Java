package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int idDeAumento;
		double porcentagemDeAumento;
		
		System.out.print("Quantos funcionarios serao registrados? ");
		n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i=0; i < n; i++) {
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, name, salary);
			list.add(funcionario);
		}
		
		System.out.print("\nEntre com o Id do funcionario que tera seu salario aumentado: ");
		idDeAumento = sc.nextInt();
		
		Funcionario funcionario = list.stream().filter(x -> x.getId() == idDeAumento).findFirst().orElse(null);
		
		if (funcionario == null) {
			System.out.println("Esse funcionario nao existe!");
		} else {
			System.out.print("Entre com a porcentagem: ");
			porcentagemDeAumento = sc.nextDouble();
			funcionario.aumentarSalario(porcentagemDeAumento);
		}
		
		System.out.println("\nLista de funcionarios:");
		for (Funcionario x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
