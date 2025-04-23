package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.ConversorMoeda;


public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Qual o preco do dolar? ");
		double dolarPreco = sc.nextDouble();
		
		System.out.println("Quantos dolares? ");
		double quantidadeDolar = sc.nextDouble();
		
		double total = ConversorMoeda.conversor(dolarPreco, quantidadeDolar);

		System.out.printf("Quantia a ser paga em reais = %.2f", total);
		
		sc.close();
	}

}
