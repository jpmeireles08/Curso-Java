package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double x, y, z;
		double media = 0;
		
		for(int i = 0; i < N; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			media = (x * 2 + y * 3 + z * 5) / (2 + 3 + 5) ;
			System.out.printf("%.1f", media);
			media = 0;
		}

		sc.close();
	}
}