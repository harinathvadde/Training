package com.zc.training;

public class ControlStatements2 {

	public static void main(String[] args) {
		int age = 17;
		double marks = 73.5;
		int year = 2020;
		System.out.println(nestedIfStatement(age, marks, year));
	}

	public static String nestedIfStatement(int age, double marks, int year) {

		if ((age >= 20) && (age <= 30)) {
			if ((marks >= 60) && (marks <= 100)) {
				if ((year == 2019) || (year == 2020)) {
					return " Your eligible ";
				} else {
					return "your not eligible because of year not matching ";
				}
			} else {
				return "your not eligible because of marks not matching ";
			}
		} else {
			return "your not eligible because of marks not matching ";
		}
	}
}
