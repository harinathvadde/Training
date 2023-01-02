package com.zc.test;

import com.zc.util.Constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		
		int age = 25;
		String name = "Hari";
		double sal = 20000;
		long mobileno = 9652754858l;
		
		Constructor c = new Constructor(age, name, sal, mobileno);
		c.details();
	}
}
