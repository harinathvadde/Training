package com.zc.strings;

public class StringPrograme {

	public static void toCharConvertion(String input) {
		char ch[] = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			System.out.print(ch[i] + " , ");
		}
		System.out.println();
	}
	
	public static void toChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i) + " , ");
		}
		System.out.println();
	}
}
