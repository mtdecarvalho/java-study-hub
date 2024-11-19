package entities;

public class Triangle {
	public double a, b, c;
	
	private double perimetro() {
		return (a + b + c) / 2;
	}
	
	public double area() {
		double p = perimetro();
		
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
