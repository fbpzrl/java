package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		TaxPayer taxPayer = null;
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine(); //nextLine() extra para consumir a quebra de linha da leitura do char.
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayer = new Individual(name, anualIncome, healthExpenditures);
				list.add(taxPayer);
			}
			else {
				
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
			    taxPayer = new Company(name, anualIncome, employees);
				list.add(taxPayer);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double totalTaxes = 0.0;
		for (TaxPayer payer : list) {
			
			totalTaxes += payer.totalTaxes();
			System.out.println(payer);
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		
		sc.close();
	}
}
