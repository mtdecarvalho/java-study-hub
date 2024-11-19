package ex1_application;

import java.util.Locale;
import java.util.Scanner;

import ex1_entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Rectangle retangulo = new Rectangle();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println(retangulo);
		
		sc.close();
	}

}
