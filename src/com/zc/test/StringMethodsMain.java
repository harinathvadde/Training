package com.zc.test;

import com.zc.strings.StringMetods;

public class StringMethodsMain {

	public static void main(String[] args) {
		String name = "harinath";
		
		String res = StringMetods.findDuplicate(name);
		System.out.println(res);
		
		StringMetods.stringMethods(name);
		
		StringBuffer str = new StringBuffer(name);
		str.append(" Vadde");
		System.out.println(str);
	}
}
