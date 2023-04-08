package _04_Estruturas_Repetitivas.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public Exercicio02() { //MÉDIA DE IDADES

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int idade = 0, quantidade = 0;
        double soma = 0, media = 0;

        System.out.println("Digite as idades:");
        idade = sc.nextInt();

        while (idade > 0) {
            soma += idade;
            quantidade++;

            System.out.print("Informe outra: ");
            idade = sc.nextInt();
        }

        media = soma / quantidade;

        if (media > 0) {
            System.out.printf("A média das idades é: %.2f", media);
        }
        else {
            System.out.println("IMPOSSÍVEL CALCULAR");
        }

        sc.close();
    }
}
