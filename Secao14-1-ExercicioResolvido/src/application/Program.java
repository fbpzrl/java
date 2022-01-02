package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine(); //consumir a quebra de linha da leitura anterior
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value por hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				
				System.out.print("Addtional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.print("PAYMENTS:");
		for (Employee emp : list) {
			
			System.out.println(emp.getName() + " - $ " + String.format("%.2f%n", emp.payment()));
		}
		
		sc.close();
	}

}
