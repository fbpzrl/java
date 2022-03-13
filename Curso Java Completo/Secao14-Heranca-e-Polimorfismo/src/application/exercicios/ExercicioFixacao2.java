package application.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class ExercicioFixacao2 {

	public ExercicioFixacao2() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Payer> list = new ArrayList<>();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));
			}
			
			System.out.println();
		}
		
		System.out.println("TAXES PAID:");
		double total = 0.0;
		for (Payer pay : list) {
			System.out.println(pay);
			total += pay.totalTaxes();
		}
		
		System.out.println();
		
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", total));
		
		sc.close();
	}
}
