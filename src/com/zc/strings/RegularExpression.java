package com.zc.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static boolean validPhoneNumber(String mobileno) {
		return Pattern.compile("(0/+91)?[^1-5][0-9]{9}").matcher(mobileno).find();
	}
	
	public static boolean validateEmail(String mailid) {
		return Pattern.compile("[^A-Z][^0-9][a-zA-Z0-9_.]*@[a-z]+[.][a-z]+").matcher(mailid).find();
	}
	
	public static boolean validateIpAddress(String ip) {
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";  
		String regex= zeroTo255 + "\\."+ zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
		return Pattern.compile(regex).matcher(ip).find();
	}
}
