package com.zc.training;

public class WhileAndDoWhile {

	public static void main(String[] args) {

		int number = 12564;
		System.out.println(" Before reverse : " + number);
		System.out.println(" After reverse : " + reverseNumber(number));
	}

	/**
	 * This method return the revered number value by usring while loop
	 * if we pass 1234 as input and it returns 4321 as output
	 * @param number
	 * @return
	 */
	public static int reverseNumber(int number) {
		int rem;
		int rev = 0;
		while (number != 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
		return rev;
	}
}
