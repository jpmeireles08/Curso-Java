package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double yearlyIncome = sc.nextDouble();
			if (c == 'i') {
				System.out.print("Health Expenses: ");
				double healthExpenses = sc.nextDouble();
				list.add(new NaturalPerson(name, yearlyIncome, healthExpenses));
			} else {
				System.out.print("Number of employees: ");
				int employeeNumbers = sc.nextInt();
				list.add(new LegalEntity(name, yearlyIncome, employeeNumbers));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for (Person person : list) {
			sum += person.incomeTax();
			System.out.printf(person.getName() + ": $ %.2f", person.incomeTax());
		}
		
		System.out.println();
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}
}
