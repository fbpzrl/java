package entities;

public class Rectangle {

	private Double width;
	private Double height;
	
	public Rectangle(Double width, Double height) {
		
		this.width = width;
		this.height = height;
	}
	
	public double area(double width, double heigh) {
		
		return width * heigh;
	}
	
	public double perimeter(double width, double heigh) {
		
		return width * 2 + heigh * 2;
	}
	
	public double diagonal(double width, double heigh) {
		
		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigh, 2));
	}
}
