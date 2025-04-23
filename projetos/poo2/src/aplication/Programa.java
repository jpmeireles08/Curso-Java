package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;

		System.out.print("Entre com um numero de conta: ");
		int num = sc.nextInt();
		System.out.print("Entre com um nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja realizar um deposito inicial? ");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.print("Entre com o valor inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(num, nome, depositoInicial);
		} else {
			conta = new Conta(num, nome);
		}
		
		System.out.println();
		
		System.out.println("Dados da conta: ");
		System.out.print(conta);
		System.out.println();
		
		System.out.println();
		System.out.print("Entre com valor de deposito: ");
		double valorDep = sc.nextDouble();
		conta.deposito(valorDep);
		System.out.println();
		System.out.println("Update na conta");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com valor de saque: ");
		double valorSaq = sc.nextDouble();
		conta.saque(valorSaq);
		System.out.println("Update na conta");
		System.out.println(conta);

		sc.close();
	}

}
