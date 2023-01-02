package com.zc.training;

public class ControlStatements {

	public static void main(String[] args) {

		int age = 25;
		if (ifCondition(age) == true) {

			System.out.println("your eligible for voting");
		} else {
			System.out.println("Your not eligible for voting your age is under 18 year");
		}
	}

	public static boolean ifCondition(int age) {

		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
