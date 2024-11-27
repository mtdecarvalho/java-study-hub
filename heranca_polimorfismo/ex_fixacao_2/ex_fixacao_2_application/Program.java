package ex_fixacao_2_application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ex_fixacao_2_entities.Pessoa;
import ex_fixacao_2_entities.PessoaFisica;
import ex_fixacao_2_entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double totalImpostoArrecadado = 0.0;
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Annual income: ");
			double rendaAnual = sc.nextDouble();
			
			if (ch == 'i' ) {
				System.out.print("Health expenditures: ");
				double gastosComSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			} else if (ch == 'c') {
				System.out.print("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (Pessoa p : list) {
			System.out.println(p.toString());
			totalImpostoArrecadado += p.valorImposto();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", totalImpostoArrecadado));
		
		sc.close();
	}

}
