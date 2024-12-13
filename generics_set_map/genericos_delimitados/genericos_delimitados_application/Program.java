package genericos_delimitados_application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import genericos_delimitados_entities.Product;
import genericos_delimitados_services.CalculationService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] elements = line.split(",");
				list.add(new Product(elements[0], Double.parseDouble(elements[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
