package com.zc.test;

import com.zc.exception.CampusDrive;

public class CampusDriveTesting {

	public static void main(String[] args) {

		double percentage = 75;
		int inputone = 50;
		int inputtwo = 0;
	
		CampusDrive cd = new CampusDrive();
		System.out.println(cd.checkEligibility(percentage));
		try {
			System.out.println(cd.division(inputone, inputtwo));
		} catch (Exception e) {
			System.out.println("exception occured " + e);
		}
		System.out.println("continue with remaining code");
	}
}
