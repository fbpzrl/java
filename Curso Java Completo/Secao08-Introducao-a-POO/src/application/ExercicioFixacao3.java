package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ExercicioFixacao3 {

	public ExercicioFixacao3() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.println();
		
		System.out.print("Enter the three scores: ");
		String[] input = sc.nextLine().split(" ");
		double exam1 = Double.parseDouble(input[0]);
		double exam2 = Double.parseDouble(input[1]);
		double exam3 = Double.parseDouble(input[2]);
		
		Student student = new Student(name, exam1, exam2, exam3);
		double result = student.finalScore(exam1, exam2, exam3);
		
		System.out.println();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", result));
		System.out.println(student.result(result));
	}
}
