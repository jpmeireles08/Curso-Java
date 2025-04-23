package exercicios_for;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int fat = N;
		
		for (int i = 1; i < N; i++ ) {
			
			fat = fat * (N - i);
		}
		
		System.out.println(fat);
		
		sc.close();
	}
}