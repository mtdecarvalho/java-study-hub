package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] quartos = new Rent[10]; // total quartos
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt(); // quartos a serem alugados
		sc.nextLine();
		
		for (int i = 0 ; i < n ; i++) {
			System.out.println();
			System.out.printf("Rent #%d\n", i+1);
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int pos = sc.nextInt();
			quartos[pos] = new Rent(nome, email);
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0 ; i < quartos.length ; i++) {
			if (quartos[i] != null) {
				System.out.println(i+1 + ": " + quartos[i]);
			}
		}
		
		sc.close();
	}

}
