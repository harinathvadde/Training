package com.zc.strings;

public class StringMetods {

	public static String findDuplicate(String input) {
		String res ="";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					res += input.charAt(i) + " , ";
					count++;
				} 
			}
		}
		return "Count of duplicate letters : " + count + " and they are : " + res;
	}
	
	public static void stringMethods(String input) {
		System.out.println(input.length());
		System.out.println(input.concat("is concatinated String"));
		System.out.println(input.indent(2));
		System.out.println(input.indexOf('t'));
		System.out.println(input.concat("a"));
		System.out.println(input.length());
		System.out.println(input.isEmpty());
		System.out.println(input.lastIndexOf("e"));
		System.out.println(input.startsWith("h"));
		System.out.println(input.toLowerCase());
		System.out.println(input.toUpperCase());
		System.out.println(input.replace("a", "*"));
		System.out.println(input.replaceAll("h", "#"));
		System.out.println(input.replaceAll("hari", "1234"));
		System.out.println(input.substring(5));
		System.out.println(input.subSequence(0,4));
	}
}
