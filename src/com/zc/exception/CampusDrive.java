package com.zc.exception;

public class CampusDrive {

	public  String checkEligibility(double percentage) {
		if (percentage <= 60) {
			throw new ArithmeticException("not eligible to drive");
		} else {
			return "Your eligible to drive";
		}
	}
	
	public int division(int inputone, int inputtwo) throws ArithmeticException {
		int div = inputone / inputtwo;
		return div;
	}
}
