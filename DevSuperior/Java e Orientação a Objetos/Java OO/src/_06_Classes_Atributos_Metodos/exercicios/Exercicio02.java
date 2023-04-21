package _06_Classes_Atributos_Metodos.exercicios;

import _06_Classes_Atributos_Metodos.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public Exercicio02() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do funcionário");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salário Bruto: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println("Funcionário: " + employee);

        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Dados atualizados: " + employee);

        sc.close();
    }
}
