package com.zc.exception;

public class ArthimaticException {

	public static void main(String[] args) {

		try {
			int number = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		 System.out.println("rest of the code...");
	}
}
