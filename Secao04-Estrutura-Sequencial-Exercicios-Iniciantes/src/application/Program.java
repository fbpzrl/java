package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Exercicio1();
		//Exercicio2();
		//Exercicio3();
		//Exercicio4();
		//Exercicio5();
		Exercicio6();
	}
	
	static void Exercicio1() {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = sc.nextInt();
		
		System.out.println("SOMA = " + (x + y));
		
		sc.close();
	}
	
	static void Exercicio2() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raioCirculo, areaCirculo;
		double pi = 3.14159;
		
		System.out.print("Informe o valor do raio de um círculo: ");
		raioCirculo = sc.nextDouble();
		
		areaCirculo = pi * Math.pow(raioCirculo, 2);
		
		System.out.printf("A=%.4f", areaCirculo);
		
		sc.close();
	}
	
	static void Exercicio3() {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = sc.nextInt();
		
		System.out.print("Digite o valor de D: ");
		d = sc.nextInt();
		
		System.out.println("DIFERENCA = " + (a * b - c * d));
		
		sc.close();
	}
	
	static void Exercicio4() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorPorHora;
		
		System.out.print("Digite o  número do Funcionário: ");
		numeroFuncionario = sc.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.print("Digite o valor da hora trabalhada: ");
		valorPorHora = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f", (horasTrabalhadas * valorPorHora));
		
		sc.close();
	}
	
	static void Exercicio5() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
		double valorPeca1, valorPeca2;
		
		System.out.println("Digite os dados da Peça 1 (Código, Quantidade e Valor):");
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite os dados da Peça 2 (Código, Quantidade e Valor):");
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", (quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2));
		
		sc.close();
	}
	
	static void Exercicio6() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.println("Digite três valores (A, B e C):");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		System.out.println();
		
		System.out.printf("ÁREA do TRIANGULO: %.3f", ((a * c) / 2));
		System.out.println();
		System.out.printf("ÁREA do CÍRCULO: %.3f", (3.14159 * Math.pow(c, 2)));
		System.out.println();
		System.out.printf("ÁREA do TRAPÉZIO: %.3f", (((a + b) * c) / 2));
		System.out.println();
		System.out.printf("ÁREA do QUADRADO: %.3f", (Math.pow(b, 2)));
		System.out.println();
		System.out.printf("ÁREA do RETÂNGULO: %.3f", (a * b));
	}

}