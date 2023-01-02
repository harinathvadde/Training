package com.zc.strings;

public class StringPalindromePrograme {

	public static String reverseString(String input) throws NullPointerException {
		String res = "";
		char ch;
		for (int i = input.length() - 1; i >= 0; i--) {
			ch = input.charAt(i);
			res += ch;
		}
		return res;
	}

	public static boolean isStringParindrome(String input) {
		if (reverseString(input).equals(input)) {
			return true;
		} else {
			return false;
		}
	}
}