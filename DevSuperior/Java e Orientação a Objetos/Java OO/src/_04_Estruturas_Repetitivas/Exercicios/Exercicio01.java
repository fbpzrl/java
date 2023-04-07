package _04_Estruturas_Repetitivas.Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public Exercicio01() { //CRESCENTE OU DECRESCENTE

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        do {
            if (numero1 != numero2) {
                if (numero1 < numero2) {
                    System.out.println("CRESCENTE");
                }
                else {
                    System.out.println("DECRESCENTE");
                }

                System.out.print("Digite outros dois números: ");
                numero1 = sc.nextInt();
                numero2 = sc.nextInt();
            }
            else if (numero1 == numero2) {
                System.out.println("Números iguais. FIM DO PROGRAMA!");
            }

        } while (numero1 != numero2);
    }
}
