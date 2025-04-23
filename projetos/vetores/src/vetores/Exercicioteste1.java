package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicioteste1 {
	public void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double media = 0;
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		double result = media / n;
		System.out.println(result);
		
		sc.close();
	}
}
