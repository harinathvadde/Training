package com.zc.test;

import com.zc.strings.VowelsConsonants;
import com.zc.strings.StringPalindromePrograme;

public class VowelsConsonentsMain {

	public static void main(String[] args) {
	
		String input = "zerocode innovations pvt ltd";
		String inputtwo = "HARINATH";
		String namethree = "malayalam";
		
		String res = VowelsConsonants.countOfVowelsConsonants(input);
		System.out.println(res);
		
		String result = StringPalindromePrograme.reverseString(inputtwo);
		System.out.println(result);
		
		//checking string palindrome or not
		boolean restwo = StringPalindromePrograme.isStringParindrome(namethree);
		System.out.println("given input string is palindrome or not : " + restwo);
	}
}
