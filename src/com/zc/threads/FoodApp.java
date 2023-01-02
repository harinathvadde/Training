package com.zc.threads;

import com.zc.abstraction.SavingsAccount;

public class FoodApp implements Runnable {

	public double bill = 0;
	public String order(int itemcode, int noofplats) throws ArithmeticException {
		switch (itemcode) {
		case 1:
			double idly = 30;
			bill = idly * noofplats;
			return "your bill amount : " + bill;
		case 2:
			double dosa = 50;
			bill = dosa * noofplats;
			return "your bill amount : " + bill;
		case 3:
			double poori = 40;
			bill = poori * noofplats;
			return "your bill amount : " + bill;
		default:
			return "Please choose correct option..!!";
		}
	}

	public String payment(double amount) {
		SavingsAccount sa = new SavingsAccount();
		return "Order placed succusfully " + sa.withdraw(amount); 
	}

	@Override
	public void run() {
		try {
			System.out.println(order(1, 3));
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(payment(bill));
		
	}
}
