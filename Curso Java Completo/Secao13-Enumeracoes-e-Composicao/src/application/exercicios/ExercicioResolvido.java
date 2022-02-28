package application.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.*;
import entities.enums.*;

public class ExercicioResolvido {

	public ExercicioResolvido() throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next().toUpperCase());
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, level, baseSalary, new Department(department));
		
		System.out.println();
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + (i + 1) +  " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			worker.addContract(new HourContract(date, valuePerHour, hours));
			
			System.out.println();
		}
		
		sc.nextLine();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String[] input = sc.next().split("/");
		int month = Integer.parseInt(input[0]);
		int year = Integer.parseInt(input[1]);
		System.out.println(worker);
		System.out.println("Income for " + input[0] + "/" + input[1] + ": " + String.format("%.2f", worker.income(month, year)));
		
		sc.close();
	}
}
