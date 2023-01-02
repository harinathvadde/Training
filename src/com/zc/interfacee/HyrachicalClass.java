package com.zc.interfacee;

public class HyrachicalClass implements HyrachicalInterfaceChildone, HyrachicalInterfaceChildTwo {

	double savingsbalance = 1000;
	double loanbalance = 20000;
	
	@Override
	public String savingsAccount() {
		return "Your account balance is : " + savingsbalance;
	}

	@Override
	public String loanAccount() {
		return "your loan remaining balance is : " + loanbalance;
	}

	@Override
	public double loanDepasite(double amount) {
		loanbalance -= amount;
		return loanbalance;
	}

	@Override
	public double loanWithdraw(double amount) {
		loanbalance += amount;
		return loanbalance;
	}

	@Override
	public double savingsDeposite(double amount) {
		savingsbalance += amount;
		return savingsbalance;
	}

	@Override
	public double savingsWithdraw(double amount) {
		savingsbalance -= amount;
		return savingsbalance;
	}
}
