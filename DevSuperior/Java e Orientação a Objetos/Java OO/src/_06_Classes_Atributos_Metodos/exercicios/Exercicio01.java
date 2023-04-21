package _06_Classes_Atributos_Metodos.exercicios;

import _06_Classes_Atributos_Metodos.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public Exercicio01() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a largura e a altura do retângulo: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle);

        sc.close();
    }
}
