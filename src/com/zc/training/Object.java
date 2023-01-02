package com.zc.training;

public class Object {

	int value = 30;
	String name = "harinath";

	public int findFactorial(int number) {
		int fact = 1;
		for (int i = number; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {

		int number = 4;

		// creating object for non static members
		Object o = new Object();

		System.out.println(o.name);
		System.out.println(o.value);
		System.out.println(o.findFactorial(number));
	}
}
