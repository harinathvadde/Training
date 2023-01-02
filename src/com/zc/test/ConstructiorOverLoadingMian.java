package com.zc.test;

import com.zc.util.ConstructorOverloading;

public class ConstructiorOverLoadingMian {

	public static void main(String[] args) {
		
		//Employee Details
		String id = "ABC@123";
		String name = "HARINATH";
		int age = 25;
		double salary = 20000;
		String role = "software Engineer";
		
		//creating object 
		ConstructorOverloading c = new ConstructorOverloading(id);
		ConstructorOverloading c1 = new ConstructorOverloading(id, name);
		ConstructorOverloading c2 = new ConstructorOverloading(id, name, age);
		ConstructorOverloading c3 = new ConstructorOverloading(id, name, age, salary);
		ConstructorOverloading c4 = new ConstructorOverloading(id, name, age, salary, role);
		
		c.details();
		c1.details();
		c2.details();
		c3.details();
		c4.details();
	}
}
