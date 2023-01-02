package com.zc.training;

public class ControlStatementsExamples {
	
	public static int isEvenNumber(int number) {
		if (number % 2 == 0) {
			return number;
		} else {
			return 0;
		}
	}
	
	public static int isOddNumber(int number) {
		if (number % 2 == 1) {
			return number;
		} else {
			return 1;
		}
	}
	
	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
