package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f\nVolume: %.2f\nPI value: %.2f", c, v, Calculator.PI);
		
		sc.close();
	}

}
