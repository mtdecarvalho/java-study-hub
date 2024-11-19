package application_ex_fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static boolean idExists(int id, List<Employee> list) {
		if (list.stream().filter(x -> x.getId() == id).findFirst().orElse(null) == null) {
			return false;
		} else return true;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		Double percentage;
		
		for (int i = 0 ; i < n ; i++) {
			System.out.println();
			System.out.printf("Employee #%d:\n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			// verificar se id ja existe
			if (idExists(id, employees)) {
				do {
					System.out.println("Informed ID already exists, please try again.");
					System.out.print("Id: ");
					id = sc.nextInt();
				} while (idExists(id, employees));
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			employees.add(i, new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have the salary increase: ");
		int id = sc.nextInt();
		
		// checa se o funcionario existe
		Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			// se existe, aplicar aumento
			System.out.print("Enter the percentage: ");
			percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee x : employees) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
