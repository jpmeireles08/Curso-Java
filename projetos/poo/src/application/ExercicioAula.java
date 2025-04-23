package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ExercicioAula {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Dados do produto" + produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para adicionar no estoque: ");
		quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para remover no estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}

}
