package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Funcionario: %s, $ %.2f", funcionario.nome, funcionario.salarioLiquido());
		System.out.println();
		
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o salario? ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.printf("Dados atualizados: %s, $ %.2f", funcionario.nome, funcionario.salarioLiquido());

		sc.close();
	}

}
