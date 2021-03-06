package application;

import java.util.Scanner;

public class ExercicioFixacao3 {

	public ExercicioFixacao3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers: ");
		String[] input = sc.nextLine().split(" ");
		int m = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		
		int[][] mat = new int[m][n];
		
		System.out.println();
		
		System.out.println("Enter the matrix numbers:");
		for (int i = 0; i < m; i++) { //rows
			for (int j = 0; j < n; j++) { //columns
				
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.print("Enter a matrix number: ");
		int number = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				if (mat[i][j] == number) {
					
					System.out.println();
					
					System.out.println("Position " + i + ", " + j + ":");
					
					if (j > 0)
						System.out.println("Left: " + mat[i][j - 1]);
					
					if (i > 0)
						System.out.println("Up: " + mat[i - 1][j]);
					
					if (j < mat.length-1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
