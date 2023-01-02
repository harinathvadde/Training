package com.zc.test;

import com.zc.strings.StringIgnoreCase;

public class StringIgnoreCaseMain {

	public static void main(String[] args) {
		
		String username = "manager";
		String password = "Admin@123";
		String inputtwo = "java,sql,web,technology,advanced,html,spring";
		String inputthree = "AbCde36fGHi123dLkjeu38492";
		
		String res = StringIgnoreCase.loginPage(username, password);
		System.out.println(res);
		
		//import method to split
		String restwo = StringIgnoreCase.extractWords(inputtwo);
		System.out.println(restwo);
		
		String resthree = StringIgnoreCase.findLettersAndNumbers(inputthree);
		System.out.println(resthree);
	}
}