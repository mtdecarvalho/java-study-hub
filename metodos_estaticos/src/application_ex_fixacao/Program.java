package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

import util_ex_fixacao.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarQuantity = sc.nextDouble();
		
		double reais = CurrencyConverter.convertToReais(dollarPrice, dollarQuantity);
		System.out.printf("Amount to be paid in Reais: R$ %.2f", reais);
		
		sc.close();
	}

}
