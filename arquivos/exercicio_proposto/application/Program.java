package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the .csv file path:");
		File sourceFile = new File(sc.nextLine());
		File sourceFileDirectory = new File(sourceFile.getParent());
		
		boolean success = new File(sourceFileDirectory + "\\out").mkdir();
		File destFile = new File(sourceFileDirectory + "\\out\\summary.csv");
		
		// valida se o caminho informado representa um arquivo válido
		if (sourceFile.isFile()) {
			System.out.println("Reading file " + sourceFile.getName() +  "...");
			try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
				String line = br.readLine();
				
				while (line != null) {
					String[] fields = line.split(",");
					
					products.add(new Product(fields[0],
							Double.parseDouble(fields[1]),
							Integer.parseInt(fields[2])));
					
					line = br.readLine();
				}
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			System.out.println("File " + sourceFile.getName() + " read successfully!");
			
			System.out.println();
			System.out.println("Writing " + destFile.getName() + "...");
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {
				for (Product product : products) {
					bw.write(product.getName() + "," + String.format("%.2f", product.subTotal()));
					bw.newLine();
				}
				
				System.out.println("Successfully created " + destFile.getName() + "!");
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		else {
			System.out.println("Error: Path informed is not a valid file.");
		}
		
		sc.close();

	}

}
