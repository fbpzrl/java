package _06_Classes_Atributos_Metodos.exercicios;

import _06_Classes_Atributos_Metodos.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public Exercicio03() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do dólar: ");
        double dolar = sc.nextDouble();

        System.out.print("Informe quantos dólares serão comprados: ");
        double quantity = sc.nextDouble();

        System.out.println("Valor a ser pago em reais = R$ " + String.format("%.2f", (dolar * CurrencyConverter.IOF) * quantity));

        sc.close();
    }
}
