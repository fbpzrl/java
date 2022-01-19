package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ExercicioResolvido1 {

	public ExercicioResolvido1() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.println();
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			Contract contract = new Contract(date, valuePerHour, hours);
			worker.addContract(contract);
			
			System.out.println();
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String[] monthAndYear = sc.next().split("/");
		int month = Integer.parseInt(monthAndYear[0]);
		int year = Integer.parseInt(monthAndYear[1]);
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear[0] + "/" + monthAndYear[1] + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}
}
