package exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		if (N >= 0 && N <= 25) {
			System.out.println("INTERVALO [0,25]");
		}
		else if (N > 25 && N <= 50) {
			System.out.println("INTERVALO (25,50]");
		}
		else if (N > 50 && N <= 75) {
			System.out.println("INTERVALO (50,75]");
		}
		else if (N > 75 && N <= 100) {
			System.out.println("INTERVALO (75,100]");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
	}

}
