package com.zc.training;

public class Narrowing {

	public static void main(String[] args) {
		
		//Narrowing
		double num = 10.56;
		float a = (float)num; 	//narrowing explictly by using type casting operator
		long b = (long)num;		//double to long
		int c = (int)num;		//double to int 
		System.out.println(" double value: " + num);
		System.out.println(" after converting to float value: " + a);
		System.out.println(" after converting to long value: " + b);
		System.out.println(" after converting to int value: " + c);
		
	}
}
