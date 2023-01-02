package com.zc.interfacee;

public class MultipleInterfaceClass implements MultipleInterface{

	double savingsbalance = 1000;
	double loanbalance = 20000;
	
	@Override
	public double areaOfPipe(double diameter) {
		double area = (Math.PI*(Math.pow(diameter, 2))/4);
		return area;
	}

	@Override
	public double velocity(double area, double discharge) {
		double velocity = discharge / area;
		return velocity;
	}

	@Override
	public String savingsAccount() {
		return "Your account balance is : " + savingsbalance;
	}

	@Override
	public String loanAccount() {
		return "your loan remaining balance is : " + loanbalance;
	}

	@Override
	public String print() {
		return "Multiple interface implementation of print method()";
	}	
}
