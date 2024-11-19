package ex2_application;

import java.util.Locale;
import java.util.Scanner;

import ex2_entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funcionario);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		funcionario.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + funcionario);
		
		sc.close();
	}

}
