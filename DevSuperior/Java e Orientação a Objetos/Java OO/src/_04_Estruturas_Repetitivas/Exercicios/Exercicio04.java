package _04_Estruturas_Repetitivas.Exercicios;

import java.util.Scanner;

public class Exercicio04 { //QUADRANTES

    public Exercicio04() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os valores das coordenadas X e Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("QUADRANTE Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("QUADRANTE Q3");
            }
            else {
                System.out.println("QUADRANTE Q4");
            }

            System.out.println();

            System.out.print("Digite os valores das coordenadas X e Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
