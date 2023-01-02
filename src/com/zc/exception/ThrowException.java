package com.zc.exception;

public class ThrowException {

	private double balance;
	public double withdraw(double amount) throws Exception {
		if (balance < amount) {
			throw new Exception("Insufficient funds");
		}
		balance -= amount;
		return balance;
	}
	
	public double deposite(double amount) throws Exception {
		if (amount <= 0) {
			throw new Exception(amount + " enter the valid amount");
		}
		balance += amount;
		return balance;
	}
}
