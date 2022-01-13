package application;

import java.util.Scanner;

public class ExercicioResolvido {

	public ExercicioResolvido() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the matrix order: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		int[] diagonal = new int[n];
		int negatives = 0;
		
		System.out.println("Enter the matrix numbers:");
		for (int i = 0; i < n; i++) { //rows
			for (int j = 0; j < n; j++) { //columns
				
				mat[i][j] = sc.nextInt();
				
				if (i == j) {
					
					diagonal[j] = mat[i][j];
				}
				
				if (mat[i][j] < 0) {
					
					negatives++;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Main diagonal:");
		for (int i = 0; i < n; i++) {
			
			System.out.print(diagonal[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Negative numbers = " + negatives);
			
		sc.close();
	}
}
