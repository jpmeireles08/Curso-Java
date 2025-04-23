package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		System.out.printf("Area do triangulo X: %.4f%n", x.area());
		System.out.printf("Area do triangulo Y: %.4f%n", y.area());
		
		if (x.area() > y.area()) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");
		}
		
		sc.close();
	}
}
