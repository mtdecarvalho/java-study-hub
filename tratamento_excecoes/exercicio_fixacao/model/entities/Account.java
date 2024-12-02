package model.entities;

import model.exceptions.InvalidInitialBalanceException;
import model.exceptions.InvalidWithdrawalException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws InvalidInitialBalanceException {
		if (balance < 0) {
			throw new InvalidInitialBalanceException("Initial balance cannot be negative");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) { 
		balance += amount;
	}
	
	public void withdraw(Double amount) throws InvalidWithdrawalException {
		if (amount > withdrawLimit) {
			throw new InvalidWithdrawalException("The amount exceeds withdraw limit");
		}
		if (balance < amount) {
			throw new InvalidWithdrawalException("Not enough balance");
		}
		balance -= amount;
	}
}
