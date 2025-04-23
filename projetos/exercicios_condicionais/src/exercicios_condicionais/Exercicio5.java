package exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = 4.00;
		double B = 4.50;
		double C = 5.00;
		double D = 2.00;
		double E = 1.50;
		int codigo, quantidade;
		double preco;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = quantidade * A;
		}
		else if (codigo == 2) {
			preco = quantidade * B;
		}
		else if (codigo == 3) {
			preco = quantidade * C;
		}
		else if (codigo == 4) {
			preco = quantidade * D;
		}
		else {
			preco = quantidade * E;
		}
		
		System.out.println("TOTAL: R$ " + preco);
		
		sc.close();
	}
}