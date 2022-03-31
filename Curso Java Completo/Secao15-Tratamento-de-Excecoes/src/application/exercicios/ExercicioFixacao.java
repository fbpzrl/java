package application.exercicios;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.FixacaoException;

public class ExercicioFixacao {

	public ExercicioFixacao() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter accountt data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine(); //consuming broken row
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, limit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch (FixacaoException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
