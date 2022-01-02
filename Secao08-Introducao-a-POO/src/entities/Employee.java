package entities;

public class Employee {

	private String name;
	private Double grossSalary;
	private Double tax;
	
	public Employee(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double netSalary() {
		
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		
		double increase = grossSalary * (percentage / 100);
		grossSalary += increase;
	}
	
	public String toString() {
		
		return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
	}
}
