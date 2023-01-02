package com.zc.training;

public class ControlStatementMain {

	public static void main(String[] args) {
		
		int number = 546;
		int rem;
		int sum = 0;
		int prod = 1;
		while (number != 0) {
			rem = number % 10;
			sum += ControlStatementsExamples.isEvenNumber(rem);
			prod *= ControlStatementsExamples.isOddNumber(rem);
			number /=10;
		}
		System.out.println(" sum of numbers : " + sum);
		System.out.println(" prod of numbers : " + prod);
		int res = sum + prod;
		System.out.println(" is even : " + ControlStatementsExamples.isEven(res));
	}
}
