package com.zc.util;

public class Constructor {

	int age;
	String name;
	double sal;
	long mobileno;
	
	public Constructor(int age, String name, double sal, long mobileno) {
		this.age = age;
		this.name = name;
		this.sal = sal;
		this.mobileno = mobileno;
	}
	
	public void details() {
		System.out.println(" Age : " + age);
		System.out.println(" Name : " + name);
		System.out.println(" salary : " + sal);
		System.out.println(" Mobile Number : " + mobileno);
	}
}
