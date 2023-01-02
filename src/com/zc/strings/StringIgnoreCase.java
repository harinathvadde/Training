package com.zc.strings;

public class StringIgnoreCase {

	public static String loginPage(String username, String Password) {
		String actusername = "Manager";
		String actpassword = "admin@123";
		if (actusername.equalsIgnoreCase(username) && actpassword.equalsIgnoreCase(Password)) {
			return "Login Successfully...!!";
		} else {
			return "Invalid username and password...!!!";
		}
	}
	
	public static String extractWords(String input) {
		String str[] = input.split(",");
		String res = "";
		int count = 1;
		for (int i = 0; i < str.length; i++) {
			res += count +"." + str[i] +"  ";
			count++;
		}
		return res;
	}
	
	public static String findLettersAndNumbers(String input) {
		int lowercasecount = 0;
		int uppercasecount = 0;
		int numbercount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
				lowercasecount++;
			} else if (Character.isLetter(ch) && Character.isUpperCase(ch)) {
				uppercasecount++;
			} else {
				numbercount++;
			}
		}
		return "count of lowercase : " + lowercasecount + " , " + " count of uppercase : " + uppercasecount
				+ " count of numbers : " + numbercount;
	}
	
	
	
	
}