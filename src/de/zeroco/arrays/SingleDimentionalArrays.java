package de.zeroco.arrays;

import java.util.Random;

public class SingleDimentionalArrays {

	public static void main(String[] args) {
		
		//1st type array declaration than initialization
		int arr[] = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//2nd type array declaration with initialization
		String names[] = {"hari","ravi","sathish"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//3rd type array declaration & initialization
		char ch[] = new char[] {'a','k','d','o','w','o','d','i','d','n'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		for (int i = ch.length - 1; i <= 0; i--) {
			System.out.println();
		}
	}
}
