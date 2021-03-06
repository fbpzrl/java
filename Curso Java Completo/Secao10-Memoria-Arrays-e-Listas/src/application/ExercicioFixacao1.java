package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ExercicioFixacao1 {

	public ExercicioFixacao1() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] student = new Student[10];
		
		System.out.print("How many rooms will be rented? ");
		int roomsRented = sc.nextInt();
		
		for (int i = 0; i < roomsRented; i++) {
			
			System.out.println();
			
			sc.nextLine(); //consume line break
			
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			student[roomNumber] = new Student(name, email, roomNumber);
		}
		
		System.out.println();
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < student.length; i++) {
			
			if (student[i] != null) {
				System.out.println(student[i]);
			}
			
		}
		
		sc.close();
	}
}
