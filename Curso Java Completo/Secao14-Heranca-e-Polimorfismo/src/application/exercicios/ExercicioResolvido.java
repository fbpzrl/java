package application.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ExercicioResolvido {

	public ExercicioResolvido() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			sc.nextLine();
			
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			double additionalCharge = 0.0;
			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				emp.add(new Employee(name, hours, valuePerHour));
			}
			
			System.out.println();
		}
		
		System.out.println("PAYMENTS:");
		for (Employee obj : emp) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
