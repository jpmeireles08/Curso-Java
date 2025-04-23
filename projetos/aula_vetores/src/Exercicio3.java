import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0, media = 0, menorQue16 = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			soma += alturas[i];
			
			if (idades[i] < 16) {
				menorQue16++;
			}
		}
		
		media = soma / n;
		System.out.printf("\nAltura média: " + "%.2f%n", media);
		
		menorQue16 = (menorQue16 / n) *100;
		System.out.println("Pessoas com menos de 16 anos: " + menorQue16 + "%");
		
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}