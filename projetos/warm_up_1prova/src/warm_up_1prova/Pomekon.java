package warm_up_1prova;

import java.util.Scanner;

public class Pomekon {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cont = 1;

		String str[] = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}

		for (int i = 0; i < (n - 1); i++) {
			int menor = i;
			for (int j = i + 1; j < n; j++) {
				if (str[j].compareTo(str[menor]) < 0) {
					menor = j;

				}
			}
			swap(str, menor, i);
		}
		
		for (int i = 0; i < n - 1; i++) {
			if (str[i].equals(str[i+1]) == false) {
				cont++;
			}
		}
		
		System.out.println("Falta(m) " + (151 - cont) + " pomekon(s).");

		sc.close();
	}

	public static void swap(String[] array, int a, int b) {
		String temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
