package _06_Classes_Atributos_Metodos.Entities;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height * 1.0;
    }

    public double perimeter() {
        return 2.0 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return "ÁREA = "
                + String.format("%.2f\n", area())
                + "PERÍMETRO = "
                + String.format("%.2f\n", perimeter())
                + "DIAGONAL = "
                + String.format("%.2f", diagonal());

    }
}
