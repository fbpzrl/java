package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioFixacao2 {

	public ExercicioFixacao2() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			sc.nextLine();
			
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
			
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (hasId(list, id)) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee obj : list) {
			
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}