package comparable_application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import comparable_entities.Employee;

public class Program {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Locale.setDefault(Locale.US);
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String name = line.split(",")[0];
				Double salary = Double.parseDouble(line.split(",")[1]);
				list.add(new Employee(name, salary));
				line = br.readLine();
			}
			
			Collections.sort(list);
			for (Employee e : list) {
				System.out.println(e.getName() + " - " + String.format("%.2f", e.getSalary()));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}