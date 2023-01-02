package com.zc.training;

public class IfElseIfStatement {

	public static void main(String[] args) {
		
		double marks = 57.38;
		System.out.println(ifElseIf(marks));
	}

	public static String ifElseIf(double marks) {
		
		if (marks >= 90) {
			return " Grade : A ";
		} else if (marks >= 70) {
			return " Grade : B ";
		} else if (marks >= 50) {
			return " Grade : C ";
		} else if (marks >= 30) {
			return "Grade : D ";
		} else {
			return " Grade : E ";
		}
	}
}
