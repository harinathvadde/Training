/**
 * range of data types
 * byte < short < int < long < float < double < boolean
 */
package com.zc.training;

public class Day2 {

	public static void main(String[] args) {

		// widening
		int num = 10; // int data type
		float b = num; // int to float data type
		double c = num; // int to double data type
		long d = num; // int to long data type
		System.out.println(" int data type: " + num);
		System.out.println(" float data type: " + b);
		System.out.println(" double data type: " + c);
		System.out.println(" long data type: " + d);
	}
}
