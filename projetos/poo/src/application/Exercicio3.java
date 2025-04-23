package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final = %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() >= 60) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
			System.out.printf("Nota faltante %.2f", aluno.notaFaltante());
		}
		
		/* Metodo toString
		 System.out.println(aluno);
		 */
		
		sc.close();
	}
}
