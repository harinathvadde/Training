package com.zc.encapsulation;

public class Bank {

	private long Accountno;
	private double balance;
			String name;
	private int atmpin;
	
	public Bank(String name) {
		super();
		this.name = name;
	}

	public long getAccountno() {
		return Accountno;
	}

	public void setAccountno(long accountno) {
		Accountno = accountno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAtmpin() {
		return atmpin;
	}

	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
	}

	@Override
	public String toString() {
		return "Bank [Accountno=" + getAccountno() + ", balance=" + getBalance() + ", name=" + name + ", atmpin=" + getAtmpin() + "]";
	}
}
