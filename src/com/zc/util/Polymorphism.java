package com.zc.util;

import java.util.Random;
import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) {
		
		//nextInt() method used in Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value : ");
		int number = sc.nextInt();
		System.out.println();
		
		//nextInt method used in Random class
		Random rd = new Random();
		int otp = rd.nextInt();
		System.out.println("Random value is : " + otp);
	}
}
