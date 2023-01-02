package com.zc.training;

public class SwitchCaseTwo {

	public static void main(String[] args) {
		int month = 13;
		int year = 2015;
		System.out.println(findDays(month, year));
	}

	public static String findDays(int month, int year) {
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return " Number of days : 31 ";
		case 4: case 6: case 9: case 11:
			return " Number of days : 30 ";
		case 2:
			if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 ==0)) {
				return " Number of days : 29 ";
			} else {
				return "Number of days : 28";
			}
			default:
				return "Invalid Month please enter between 1 to 12 only";
		}
	}
}
