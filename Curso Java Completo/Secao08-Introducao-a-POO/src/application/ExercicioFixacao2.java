package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioFixacao2 {

	public ExercicioFixacao2() {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee emp = new Employee(name, grossSalary, tax);
		
		System.out.println();
		
		System.out.println(emp);
		
		System.out.println();
		
		System.out.print("Witch percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println();
		
		System.out.println("Updated data: " + emp);
	}
	
}
