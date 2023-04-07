package _04_Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;
public class Loop {

    public static void whileLoop() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número maior que zero: ");
        int numero = sc.nextInt();

        while (numero != 0) { //usado quando não se sabe previamente a quantidade de repetições

            System.out.println("O número digitado foi: " + numero);
            System.out.println();
            System.out.print("Informe outro número: ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Você digitou 0. FIM DO PROGRAMA !");
            }
        }

        sc.close();
    }

    public static void forLoop() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número de repetições: ");
        int repeticoes = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < repeticoes; i++) { //usado quando se sabe previamente a quantidade de repetições

            System.out.print("Informe um número inteiro: ");
            int numero = sc.nextInt();

            soma += numero;
        }

        System.out.println();
        System.out.println("A soma dos números digitados é: " + soma);

        sc.close();
    }

    public static void doWhileLoop() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char repetir;

        do {
            System.out.print("Digite a temperadura em Celsius: ");
            double celsius = sc.nextDouble();

            double fah = (9 * celsius) / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fah);
            System.out.println();

            System.out.print("Deseja repetir (s / n)? ");
            repetir = sc.next().charAt(0);


        } while (repetir == 's');

        sc.close();
    }
}
