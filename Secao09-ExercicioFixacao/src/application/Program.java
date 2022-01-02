package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine(); //esse comando serve para consumir a quebra de linha quando dei o nextInt()
		String holder = sc.nextLine();
		
		System.out.print("Is the an initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		if (initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			acc = new Account(number, holder, deposit);
		} else {
			acc = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		
		System.out.print("Enter a deposit value: ");
		acc.deposit(sc.nextDouble());
		
		System.out.println();
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		System.out.print("Enter a withdraw value: ");
		acc.withDraw(sc.nextDouble());
		
		System.out.println();
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		sc.close();
	}
}
