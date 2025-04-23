package exercicios_sequencias;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, nPeca1, nPeca2;
		double valor1, valor2, valorTotal;
		
		peca1 = sc.nextInt();
		nPeca1 = sc.nextInt();
		valor1= sc.nextDouble();
		valorTotal = nPeca1 * valor1;
		
		peca2 = sc.nextInt();
		nPeca2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorTotal = valorTotal + (nPeca2 * valor2);
		
		System.out.printf("VALOR A PAGAR POR PECA %d E PECA %d: R$ %.2f ",peca1, peca2, valorTotal);
	
		sc.close();
	}

}