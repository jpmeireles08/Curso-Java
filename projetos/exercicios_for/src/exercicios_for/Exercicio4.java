package exercicios_for;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = x / y;
				System.out.println(divisao);
			}
		}
		
		sc.close();
	}
}