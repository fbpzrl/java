package entities;

public class Student {

	private String name;
	private Double exam1;
	private Double exam2;
	private Double exam3;
	
	public Student(String name, Double exam1, Double exam2, Double exam3) {
		this.name = name;
		this.exam1 = exam1;
		this.exam2 = exam2;
		this.exam3 = exam3;
	}
	
	public double finalScore(double exam1, double exam2, double exam3) {
		return exam1 + exam2 + exam3;
	}
	
	public String result(double result) {
		
		if (result < 60) {
			return "FAILED\nMISSING " + String.format("%.2f", (60 - result)) + " POINTS";
		}
		
		return "PASS";
		
	}
}
