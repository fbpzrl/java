package _08_Memoria_Vetores_Listas.exercicios;

import java.util.Scanner;

public class Exercicio01 { //NÚMEROS NEGATIVOS

    public Exercicio01() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
