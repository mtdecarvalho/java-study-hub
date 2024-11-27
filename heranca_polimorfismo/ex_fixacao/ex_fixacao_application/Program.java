package ex_fixacao_application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ex_fixacao_entities.ImportedProduct;
import ex_fixacao_entities.Product;
import ex_fixacao_entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (option == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String date = sc.nextLine();
				Instant manufactureDate = Instant.from(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
						.atStartOfDay().atZone(ZoneId.systemDefault()));
				list.add(new UsedProduct(name, price, manufactureDate));
			} else if (option == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("PRICE TAGS:");
		
		for (Product p : list) {
			System.out.println(p.toString());
		}

		sc.close();

	}

}
