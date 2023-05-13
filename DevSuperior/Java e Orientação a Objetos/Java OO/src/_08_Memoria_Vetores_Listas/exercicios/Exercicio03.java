package _08_Memoria_Vetores_Listas.exercicios;

import _08_Memoria_Vetores_Listas.entities.*;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public Exercicio03() {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[n];
        double sumHeight = 0;
        int lessSixteen = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", (i + 1));
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age < 16) {
                lessSixteen++;
            }

            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();
            sumHeight += height;

            vect[i] = new Person(name, age, height);
        }

        System.out.println();

        System.out.printf("Altura média: %.2f\n", (sumHeight / n));
        System.out.println("Pessoas com menos de 16 anos: " + (lessSixteen * 100 / n) + "%");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
