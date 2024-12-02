package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.InvalidInitialBalanceException;
import model.exceptions.InvalidWithdrawalException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");

			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);

			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		} catch (InvalidWithdrawalException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (InvalidInitialBalanceException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error!");
			e.printStackTrace();
		}

		sc.close();

	}

}
