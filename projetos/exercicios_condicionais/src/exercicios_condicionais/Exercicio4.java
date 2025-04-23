package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C;
		
		if (A < B) {
			C = B - A;
			System.out.println("O JOGO DUROU " + C + " HORA(S)");
		}
		else {
			C = (24 - A) + B;
			System.out.println("O JOGO DUROU " + C + " HORA(S)");
		} 
		sc.close();
	}
}