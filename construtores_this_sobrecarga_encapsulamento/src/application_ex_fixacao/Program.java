package application_ex_fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities_ex_fixacao.BankAccount;

public class Program {

	public static void main(String[] args) {
		int accountNumber;
		String accountOwner;
		char option;
		double value;
		BankAccount account;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		accountOwner = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		option = sc.nextLine().charAt(0);
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			account = new BankAccount(accountNumber, accountOwner, value);
		} else {
			account = new BankAccount(accountNumber, accountOwner);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		account.deposit(value);

		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);

		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
