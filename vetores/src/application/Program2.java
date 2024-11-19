package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		double avg = 0;
		
		for (int i = 0 ; i < vect.length ; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Product(nome, preco);
			avg += vect[i].getPreco();
		}
		
		avg /= vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f\n", avg);

		sc.close();
	}

}
