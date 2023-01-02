package com.zc.test;

import com.zc.strings.StringPrograme;

public class StringProgrameMain {

	public static void main(String[] args) {
		
		String nameone = "harinath";
		String nametwo = "zerocode";
		char input[] = new char[] {'j','a','v','a','d','e','v','e','l','o','p','e','r'};
		
		//import method to covert string to char by using toCharArray method
		StringPrograme.toCharConvertion(nameone);
		
		//Converting to char to string
		String str = new String(input);
		System.out.println(str);
		
		//import method to covert String to char by using charAt method
		StringPrograme.toChar(nametwo);
	}
}