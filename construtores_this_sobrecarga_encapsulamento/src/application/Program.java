package application;

import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		System.out.print("Price: ");
		double preco = sc.nextDouble();
		//System.out.print("Quantity in stock: ");
		//int qtd = sc.nextInt();
		
		Product p1 = new Product(nome, preco);
		
		System.out.println();		
		System.out.println("Product data: " + p1);
		
		System.out.print("Enter the number of products to be added in stock: ");
		p1.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated data: " + p1);
		
		System.out.print("Enter the number of products to be remove from stock: ");
		p1.removeProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated data: " + p1);
		
		sc.close();
	}

}
