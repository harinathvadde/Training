package com.zc.util;

public class ConstructorOverloading {

	String id;
	String name;
	int age;
	double salary;
	String role;
	
	public ConstructorOverloading(String id) {
		this.id = id;
	}
	public ConstructorOverloading(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public ConstructorOverloading(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public ConstructorOverloading(String id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public ConstructorOverloading(String id, String name, int age, double salary, String role) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.role = role;
	}
	
	public void details() {
		System.out.println("Employee Details:");
		System.out.println("Employee Id     : " + id);
		System.out.println("Employee Name   : " + name);
		System.out.println("Employee Age    : " + age);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee role   : " + role);
	}	
}
