package ex_fixacao_application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import ex_fixacao_entities.Contract;
import ex_fixacao_entities.Installment;
import ex_fixacao_services.ContractService;
import ex_fixacao_services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		String dateStr = sc.nextLine();
		LocalDate date = LocalDate.parse(dateStr, fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int months = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, months);
		
		System.out.println("Parcelas:");
		for (Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
