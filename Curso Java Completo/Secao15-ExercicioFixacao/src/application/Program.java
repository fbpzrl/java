package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine(); //nextLine() extra para consumir a quebra de linha da leitura do number
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		Double initialBalance = balance;
		
		System.out.print("Withdraw limit: ");
		Double limit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, limit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		account.withdraw(sc.nextDouble());
		if (initialBalance != account.getBalance()) {
			System.out.println("New balance: " + account.getBalance());
		}
		
	}

}
