package com.zc.test;

import com.zc.strings.RegularExpression;

public class RegexMain {

	public static void main(String[] args) {
		
		String mobileno = "7895649875";
		String mailid = "harinathvadde46@gmal.com";
		String ip = "121.234.12.12";
		
		boolean res = RegularExpression.validPhoneNumber(mobileno);
		System.out.println(res);
		
		boolean restwo = RegularExpression.validateEmail(mailid);
		System.out.println(restwo);
		
		boolean resthree = RegularExpression.validateIpAddress(ip);
		System.out.println(resthree);
	}
}
