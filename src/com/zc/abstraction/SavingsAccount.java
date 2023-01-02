package com.zc.abstraction;

public class SavingsAccount extends Account {

	double balance = 1000; 
	@Override
	public String deposite(double amount) {
		balance += amount;
		return "The amount of " + amount + " is credited to your account and balance is : " + balance;
	}

	@Override
	public String withdraw(double amount) {
		balance -= amount;
		return "The amount of " + amount + " is debited to your account and balance is : " + balance;
	}
}
