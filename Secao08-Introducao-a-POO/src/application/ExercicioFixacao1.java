package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao1 {

	public ExercicioFixacao1() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rectangle width and heigh: ");
		String[] input = sc.nextLine().split(" ");
		
		double width = Double.parseDouble(input[0]);
		double heigh = Double.parseDouble(input[1]);
		
		Rectangle rec = new Rectangle(width, heigh);
		
		System.out.println();
		System.out.printf("AREA = %.2f%n", rec.area(width, heigh));
		System.out.printf("PERIMETER = %.2f%n", rec.perimeter(width, heigh));
		System.out.printf("DIAGONAL = %.2f%n", rec.diagonal(width, heigh));
		
		sc.close();
	}
}
