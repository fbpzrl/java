package application;

import java.util.Scanner;
import entities.Aluguel;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluguel[] aluguel = new Aluguel[10];

		System.out.print("Quantos estudantes vão alugar quartos? (1 até 10) ");
		int n = sc.nextInt();

		System.out.println();

		for (int i = 0; i < n; i++) {

			System.out.println("Dados do Estudante #" + (i + 1));

			System.out.print("Nome: ");
			sc.nextLine(); // consumindo a quebra de linha do nextInt() acima
			String nome = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.next();

			System.out.print("Quarto: ");
			int quarto = sc.nextInt();

			while ((quarto < 1) || (quarto > 10)) {
				System.out.println("Informe um número entre 1 e 10");
				quarto = sc.nextInt();
			}

			while (aluguel[quarto] != null) {

				System.out.println("Quarto ocupado. Informe outro");
				quarto = sc.nextInt();
			}

			aluguel[quarto] = new Aluguel(nome, email, quarto);
		}

		System.out.println();

		System.out.println("Quartos ocupados:");
		for (int i = 0; i < aluguel.length; i++) {

			if (aluguel[i] != null) {

				System.out.println(aluguel[i]);
			}
		}
	}

}
