package com.zc.strings;

public class OverrideObjectClasses {

	public static void main(String[] args) {
		
		//object which is created without using new keyword is known as String Litral.
		String str = "java";
		String strone = "Java";
		String strtwo = "java";
		System.out.println(str.toString());
		System.out.println(str.hashCode());
		System.out.println(strone.toString());
		System.out.println(strone.hashCode());
		System.out.println(str.equals(strone));
		System.out.println(strtwo.toString());
		System.out.println(strtwo.hashCode());
	}
}
