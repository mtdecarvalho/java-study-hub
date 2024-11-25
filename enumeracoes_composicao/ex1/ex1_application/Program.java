package ex1_application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import ex1_entities.Department;
import ex1_entities.HourContract;
import ex1_entities.Worker;
import ex1_entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter department's name: ");
		String deptName = sc.nextLine();

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Level: ");
		String level = sc.nextLine();

		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(deptName));

		System.out.print("How many contracts to this worker? ");
		int contracts = sc.nextInt();

		for (int i = 1; i <= contracts; i++) {
			sc.nextLine();
			System.out.printf("Enter contract #%d data:\n", i);

			System.out.print("Date (DD/MM/YYYY): ");
			String dateString = sc.nextLine();
			LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();

			System.out.print("Duration (hours): ");
			Integer duration = sc.nextInt();

			HourContract contract = new HourContract(date, valuePerHour, duration);
			worker.addContract(contract);

		}
		
		System.out.println();
		sc.nextLine();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String aux = sc.nextLine();
		Integer month = Integer.parseInt(aux.split("/")[0]);
		Integer year = Integer.parseInt(aux.split("/")[1]);


		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for %s: %.2f", aux, worker.income(month, year));

		sc.close();

	}

}
