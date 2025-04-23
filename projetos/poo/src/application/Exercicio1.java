package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Area: " + retangulo.area());
		System.out.println("Perimetro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		
		sc.close();
	}

}
