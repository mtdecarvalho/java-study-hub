package entities_ex_fixacao;

public class BankAccount {
	private int accountNumber;
	private String accountOwner;
	private double accountBalance;
	private final double WITHDRAWAL_TAX = 5.00;

	public BankAccount(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(0);
	}

	public BankAccount(int accountNumber, String accountOwner, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(accountBalance);
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void deposit(double value) {
		accountBalance += value;
	}

	public void withdraw(double value) {
		accountBalance -= value + WITHDRAWAL_TAX;
	}

	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", getAccountNumber(), getAccountOwner(),
				getAccountBalance());
	}
}
