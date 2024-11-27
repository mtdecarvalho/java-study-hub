package metodos_abstratos_application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import metodos_abstratos_entities.Circle;
import metodos_abstratos_entities.Rectangle;
import metodos_abstratos_entities.Shape;
import metodos_abstratos_entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			} else if (ch == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}	
		
		System.out.println("SHAPE AREAS:");
		
		for (Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		
		sc.close();

	}

}
