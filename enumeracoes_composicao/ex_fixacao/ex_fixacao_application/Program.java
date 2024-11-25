package ex_fixacao_application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import ex_fixacao_entities.Client;
import ex_fixacao_entities.Order;
import ex_fixacao_entities.OrderItem;
import ex_fixacao_entities.Product;
import ex_fixacao_entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.nextLine();
		Instant birthDate = LocalDate.parse(date, fmt).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items in this order? ");
		int n = sc.nextInt();
		
		Order order = new Order(OrderStatus.valueOf(status), client);
		
		for (int i = 1 ; i <= n ; i ++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			order.addItem(new OrderItem(quantity, price, new Product(prodName, price)));
		}
		
		System.out.println(order);
		
		sc.close();

	}

}
