package com.zc.abstraction;

public class FoodApp extends AppPlans {

	double bill = 0;
	@Override
	public String order(int itemcode, int noofplats) throws ArithmeticException {
		switch (itemcode) {
		case 1:
			double idly = 30;
			bill = idly * noofplats;
			return payment(bill);
		case 2:
			double dosa = 50;
			bill = dosa * noofplats;
			return payment(bill);
		case 3:
			double poori = 40;
			bill = poori * noofplats;
			return payment(bill);
		default:
			return "Please choose correct option..!!";
		}
	}

	@Override
	public String payment(double amount) {
		SavingsAccount sa = new SavingsAccount();
		return "Order placed succusfully " + sa.withdraw(amount); 
	}
}
