package _07_Construtores_This_Sobrecarga_Encapsulamento.exercicios;

import _07_Construtores_This_Sobrecarga_Encapsulamento.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public Exercicio01() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y / n) ? ");
        char haveInitialDeposit = sc.next().charAt(0);
        double initialDeposit = 0.0;
        if (haveInitialDeposit == 'y' || haveInitialDeposit == 'Y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        System.out.println();

        Account account = new Account(number, holder, initialDeposit);
        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();

        account.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();

        account.withdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
