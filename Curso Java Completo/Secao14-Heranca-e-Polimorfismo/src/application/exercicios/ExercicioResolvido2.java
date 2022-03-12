package application.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;
import entities.enums.Color;

public class ExercicioResolvido2 {

	public ExercicioResolvido2() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char typeShape = sc.next().charAt(0);
			
			System.out.print("COLOR (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			
			if (typeShape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
			
			System.out.println();
		}
		
		System.out.println("SHAPE AREAS:");
		for (Shape sha : list) {
			System.out.println(sha);
		}
		
		sc.close();
	}
}
