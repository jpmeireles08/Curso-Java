package algoritimos_pesquisa;

import java.util.Scanner;

public class PesquisaBinaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 8;
		
		int vetor[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("");
		
		ordenacaoSelecao(vetor, n);
		
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("");
		
		if (pesquisaBinaria(vetor, n, x)) {
			System.out.println("Elemento " + x + " encontrado");
		} else {
			System.out.println("Elemento " + x + " nao encontrado");
		}
		
		
		sc.close();
	}
	
	static boolean pesquisaBinaria (int vetor[], int n, int x) {
		boolean resp = false;
		int dir = n - 1;
		int esq = 0;
		int meio;
		while (esq <= dir) {
			meio = (esq + dir) / 2;
			if (x == vetor[meio]) {
				resp = true;
				esq = n;
			} else if (x > vetor[meio]) {
				esq = meio + 1;
			} else {
				dir = meio - 1;
			}
		}
		return resp;
	}
	
	static void ordenacaoSelecao (int vetor[], int n) {
		for (int i = 0; i < (n - 1); i++) {
			int menor = i;
			for (int j = i + 1; j < n; j++) {
				if (vetor[menor] > vetor[j]) {
					menor = j;
				}
			}
			swap(vetor, menor, i);
		}
	}
	
	static void swap (int vetor[], int a, int b) {
		int temp = vetor[a];
		vetor[a] = vetor[b];
		vetor[b] = temp;
	}

}
