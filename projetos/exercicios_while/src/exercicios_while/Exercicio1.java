package exercicios_while;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		
		int senha = sc.nextInt();
		
		while (senha != senhaCorreta) {
			
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}
