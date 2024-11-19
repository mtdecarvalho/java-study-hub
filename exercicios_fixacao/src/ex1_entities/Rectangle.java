package ex1_entities;

public class Rectangle {
	public double width, height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return String.format("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f", area(), perimeter(), diagonal());
	}
}
