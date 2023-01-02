package com.zc.test;

import com.zc.abstraction.*;

public class AbstractMain {

	public static void main(String[] args) {
		
		double amount = 200;
	
		SavingsAccount s = new SavingsAccount();
		System.out.println(s.deposite(amount));
		System.out.println(s.withdraw(amount));
	}
}
