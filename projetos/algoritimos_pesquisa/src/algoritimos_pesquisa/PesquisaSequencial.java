package algoritimos_pesquisa;

import java.util.Scanner;

public class PesquisaSequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int vetor[] = new int[n];
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextInt();
		}
		int x = 25;
		
		if(pesquisaSequencial(vetor, x)) {
			System.out.println("SIM");
		} else {
			System.out.println("NAO");
		}
		

		sc.close();
	}
	
	static boolean pesquisaSequencial (int[] vetor, int x) {
		boolean resp = false;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor [i] == x) {
				resp = true;
				i = vetor.length;
			}
		}
		return resp;
	}

}
