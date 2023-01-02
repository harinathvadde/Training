package com.zc.test;

import com.zc.interfacee.*;

public class HyrachicalInterfaceMain {

	public static void main(String[] args) {
		
		double amountdepostire = 500;
		double amountwithdraw = 1000;
		double loandeposite  = 5000;
		double loanwithdraw = 50000;
		
		HyrachicalClass hc = new HyrachicalClass();
		System.out.println(hc.savingsAccount());
		System.out.println(hc.savingsDeposite(amountdepostire));
		System.out.println(hc.savingsWithdraw(amountwithdraw));
		System.out.println(hc.loanAccount());
		System.out.println(hc.loanDepasite(loandeposite));
		System.out.println(hc.loanWithdraw(loanwithdraw));
	}
}
