package _08_Memoria_Vetores_Listas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 { //SOMA E MEDIA

    public Exercicio02() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.println();

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f ", vect[i]);
        }

        System.out.println();

        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MÉDIA = %.2f", (sum / n));

        sc.close();
    }
}
