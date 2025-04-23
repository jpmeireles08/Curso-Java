package algoritmos_ordenacao;

import java.util.Random;
import java.util.Scanner;

public class Quicksort {

	public static int contComp = 0;
	public static int contMov = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Random random = new Random();

		int vetor[] = new int[N];

		for (int i = 0; i < N; i++) {
			vetor[i] = random.nextInt(100);
		}

		System.out.print("[");
		for (int i = 0; i < N; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.print("]");

		quicksort(0, N - 1, vetor);

		System.out.println("");

		System.out.print("[");
		for (int i = 0; i < N; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.print("]");

		System.out.println("");
		System.out.println("Comparacoes: " + contComp);

		sc.close();
	}

	static void quicksort(int esq, int dir, int vetor[]) {
		int i = esq, j = dir, pivo = vetor[(dir + esq) / 2];
		while (i <= j) {
			while (vetor[i] < pivo) {
				i++;
				contComp++;
			}

			while (vetor[j] > pivo) {
				j--;
				contComp++;
			}

			if (i <= j) {
				swap(i, j, vetor);
				i++;
				j--;
			}
		}
		if (esq < j) {
			quicksort(esq, j, vetor);
		}

		if (i < dir) {
			quicksort(i, dir, vetor);
		}
	}

	static void swap(int i, int j, int vetor[]) {
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}

}
