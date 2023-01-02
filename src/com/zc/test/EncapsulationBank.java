package com.zc.test;

import com.zc.encapsulation.Bank;

public class EncapsulationBank {

	public static void main(String[] args) {
		
		long Accountno = 5649613654949613l;
		double balance = 658132.31;
		String name = "HARINATH";
		int atmpin = 4569;
		
		Bank bank = new Bank(name);
		bank.setAccountno(Accountno);
		bank.setBalance(balance);
		bank.setAtmpin(atmpin);
		System.out.println(bank.toString());
	}
}
